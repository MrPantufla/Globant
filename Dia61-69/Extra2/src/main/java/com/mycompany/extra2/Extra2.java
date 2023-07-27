package com.mycompany.extra2;
import Services.CantanteFamosoService;
import Objects.CantanteFamoso;
import java.util.ArrayList;

public class Extra2 {
    public static void main(String[] args) {
        ArrayList <CantanteFamoso> lista = new ArrayList();
        lista.add(new CantanteFamoso("cantante1", "disco1"));
        lista.add(new CantanteFamoso("cantante2", "disco2"));
        lista.add(new CantanteFamoso("cantante3", "disco3"));
        lista.add(new CantanteFamoso("cantante4", "disco4"));
        lista.add(new CantanteFamoso("cantante5", "disco5"));
        
        CantanteFamosoService c = new CantanteFamosoService();
        c.añadirLista(lista);
        c.menu();
    }
}
