package com.ideyatech;

import com.ideyatech.domain.Company;
import com.ideyatech.repository.BrandRepository;
import com.ideyatech.repository.CompanyRepository;
import com.ideyatech.service.CompanyService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Created by nicktunac on 17/08/2016.
 */
@Component
public class ApplicationLoader implements CommandLineRunner {

    @Autowired
    private CompanyService companyService;

    @Autowired
    private BrandRepository brandRepository;

    private static final Logger _log = Logger.getLogger(ApplicationLoader.class);

    @Override
    public void run(String... strings) throws Exception {

//        if (strings.length == 0 ) {
//            _log.error("No File Specified");
//        } else {
            /*_log.info("Reading file: " + strings[0]);

            Company c = new Company();
            c.setCode(1233);
            c.setCompanyName("Yappiiee");

            companyRepository.save(c);*/



            try {

                File xmlFile = new File("example.xml");
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(xmlFile);

                doc.getDocumentElement().normalize();

                NodeList nList = doc.getElementsByTagName("Company");

                _log.info("Iterating Companies");

                for (int temp = 0; temp < nList.getLength(); temp++) {

                    Node nNode = nList.item(temp);

                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                        Element e = (Element) nNode;

                        Company _company = companyService.builder(e);

                        Company company = companyService.findByCode(_company.getCode());

                        if(company == null) {
                            company = _company;
                            companyService.save(company);
                        }
                    }
                }



            } catch(Exception e) {
                _log.error("An error occurred");
                e.printStackTrace();
            }

        }
    }

