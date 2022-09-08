package model;

import service.FinderImpl;

import javax.jws.WebService;


@WebService
public class Finder {

    FinderImpl finder= new FinderImpl();
    public int cal(int  year, int month, int day){

        return finder.calculateDB(year, month, day);


    }
}
