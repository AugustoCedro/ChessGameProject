package boardgame.model.entities;

import javax.swing.text.StyledEditorKit;

public class BoardException extends RuntimeException{
    public BoardException(String msg){
        super(msg);
    }
}
