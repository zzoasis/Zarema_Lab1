/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zarema_lab1;

/**
 *
 * @author student
 */
public class Notebook {
    
    private String name;
    private int page;
    private String size;
    private boolean isUniversal_Print_Media;
    
    public Notebook() {
        this.name = "diary";
        this.page = 96;
        this.size = "A4";
        this.isUniversal_Print_Media = true;
    }
    
    public Notebook(int page, String size, boolean isUniversal_Print_Media) {
        this.name = name;
        this.page = page;
        this.size = size;
        this.isUniversal_Print_Media = isUniversal_Print_Media;
        
    }
   
    public Notebook(String name, int page, String size, boolean isUniversal_Print_Media) {
        this.name = name;
        this.page = page;
        this.size = size;
        this.isUniversal_Print_Media = isUniversal_Print_Media;
    }
            
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    public boolean isIsUniversal_Print_Media() {
        return isUniversal_Print_Media;
    }

    public void setIsUniversal_Print_Media(boolean isUniversal_Print_Media) {
        this.isUniversal_Print_Media = isUniversal_Print_Media;
    }
 
    
     @Override
    public String toString() {
        return name + " {" + "page=" + page + ", size=" + size + ", isUniversal_Print_Media=" + isUniversal_Print_Media + '}';
    }
}
