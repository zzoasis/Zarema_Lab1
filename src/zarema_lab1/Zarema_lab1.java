
package zarema_lab1;

public class Zarema_lab1 {

    public static void main(String[] args) {
       Notebook diary = new Notebook();

        diary.setName("diary");
        diary.setPage(96);
        diary.setSize("A4");
        diary.setIsUniversal_Print_Media(true);
        
        System.out.println(diary.getName());
        System.out.println(diary.getPage());
        System.out.println(diary.getSize());
        System.out.println(diary.isIsUniversal_Print_Media());
        
        System.out.println(diary);
        
        Notebook scetchbook = new Notebook("scetchbook",60, "A5", false);
        System.out.println(scetchbook);
        
        Notebook organizer = new Notebook("organizer",48, "A6", true);
        System.out.println(organizer);
       
    }
    
}
