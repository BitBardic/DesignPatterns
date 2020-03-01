package com.codewithnas.behavioural.mediator.using_observer;

public class ArticlesDialogBox  {
    private ListBox articlesListBox = new ListBox();
    private TextBox titleTextBox = new TextBox();
    private Button saveButton = new Button();

    public ArticlesDialogBox() {

        // 1st approach anonymous method
       /* articlesListBox.attach(new Observer() {
            @Override
            public void update() {
                articleSelected();
            }
        });*/

       // 2nd approach lambda operator
       /* articlesListBox.attach(() ->  articleSelected()); */

        // 3rd approach shorter way adding reference of method
        articlesListBox.addEventHandler(this::articleSelected);
        titleTextBox.addEventHandler(this::titleChanged);
    }

    public void simulateUserInteraction() {
        articlesListBox.setSelection("Article 1");
        titleTextBox.setContent("");
        titleTextBox.setContent("Article 2");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println("Button: " + saveButton.isEnabled());
    }

    private void titleChanged() {
        var content = titleTextBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }

    private void articleSelected() {
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }
}
