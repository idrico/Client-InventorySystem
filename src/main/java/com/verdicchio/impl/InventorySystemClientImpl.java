package com.verdicchio.impl;

import com.verdicchio.InventorySystemClient;
import com.verdicchio.model.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by verdian on 12/11/2015.
 */
public class InventorySystemClientImpl implements InventorySystemClient {




    public InventorySystemClientImpl() {
initClientservice();
    }

    public void initClientservice()
    {
        try {

            String UrlString = "Your WSDL URL";  //
            String nameSpaceUri = "urn:Foo";
            String serviceName = "MyHelloService";
            String portName = "HelloIFPort";

            System.out.println("UrlString = " + UrlString);
            URL helloWsdlUrl = new URL(UrlString);

            /*ServiceFactory serviceFactory =
                    ServiceFactory.newInstance();

            Service helloService =
                    serviceFactory.createService(helloWsdlUrl,
                            new QName(nameSpaceUri, serviceName));

            dynamicproxy.HelloIF myProxy =
                    (dynamicproxy.HelloIF)
                            helloService.getPort(
                                    new QName(nameSpaceUri, portName),
                                    dynamicproxy.HelloIF.class);*/

            System.out.println("Initialization client Service");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }




    public Boolean checkApplicability(){
        Boolean isApplicable = false;
        return isApplicable;
    }

    public List<Category> getCategory(){
        List<Category> categoryList = new ArrayList<Category>();
        categoryList.add(new Category("Walls"));
        categoryList.add(new Category("Windows"));
        categoryList.add(new Category("Doors"));

        return categoryList;
    }

     public List< ? extends Item> getItemByCategory(long idCategory){

         if(idCategory==1)
         {
             List<Wall> walls = new ArrayList<Wall>();
             walls.add(new Wall("DryWall","The material of the wall is DryWall",10,10));
             walls.add(new Wall("WallA","DryWall description A",10,10));
             walls.add(new Wall("WallB","DryWall description B",10,10));

             return walls;
         } else if(idCategory==2)
         {
             List<Window> windows = new ArrayList<Window>();
             windows.add(new Window("WindowA","Window description A", WindowTypeOfOpeningEnum.TYPE_OF_OPENING_A));
             windows.add(new Window("WindowB","Window description B",WindowTypeOfOpeningEnum.TYPE_OF_OPENING_B));
             windows.add(new Window("WindowC","Window description C",WindowTypeOfOpeningEnum.TYPE_OF_OPENING_C));

             return windows;
         }

        return null;
    }

}
