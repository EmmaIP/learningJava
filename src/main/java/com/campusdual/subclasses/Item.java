package com.campusdual.subclasses;

public class Item {    //clase base o superclase con sus atributos básicos
    private String title;
    private String publicationDate;
    private boolean checkedOut = false;   //alquiler

    public Item(String title, String publicationDate) {
        this.title = title;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublicationDate() {
        return this.publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public boolean isCheckedOut() {
        return this.checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public String getDetails() {
        return "Title: " + this.title + ", Publication Date: "
                + this.publicationDate + ", Checked out: " + this.checkedOut;
    }

  //método para alquilar un item
    public void checkedOut() {
        if(!this.checkedOut) {     //comprueba que no está alquilado
            this.checkedOut = true;  //aquí lo alquila
            System.out.println(this.title + " has been checked out");
        }
        else {                          //aquí está alquilado
            System.out.println(this.title + " is already checked out");
        }
    }

    public void returnItem() {
        if(this.checkedOut) {
            this.checkedOut = false;
            System.out.println(this.title + " has been returned");
        }
        else {

            System.out.println(this.title + " was not checked out");
        }
    }
}
