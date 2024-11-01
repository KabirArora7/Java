import java.util.ArrayList;
import java.util.List;


public class Article implements ArticleComponent {
    // Contains various elements like paragraph and picture


    // Use display to show all components in seq
    List <ArticleComponent> container = new ArrayList<>();
    // Initialise list

    // Add different components from list

    // Paragraph para1 = new Paragraph("Kabir is a student!");
    // Picture pic1 = new Picture("/Home/Downloads/Image1");

    // Implement methods to do add and remove elements

    // How to display individually
    public void addComponent(ArticleComponent s){
        container.add(s);
        return;
    }

    public void removeComponent(ArticleComponent s){
        container.remove(s);
        return;
    }


    // Allow adding removing components
    
    @Override
    public void display() {
        System.out.println("Displaying Article");
        for (ArticleComponent component : container ){ // Loop in the list
            component.display();
        }
    }
}
