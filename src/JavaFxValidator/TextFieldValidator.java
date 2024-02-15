/*
    @FXML
    private TextField txt1, txt2, txt3, txt4;

    @FXML
    private void eventKey(KeyEvent event){

        Object evt = event.getSource();

        if(evt.equals(txt1)){

            if(!Character.isLetter(event.getCharacter().charAt(0)) && !event.getCharacter().equals(" ")){
                event.consume();
            }

        }else if(evt.equals(txt2)){

            if(!Character.isDigit(event.getCharacter().charAt(0))){
                event.consume();
            }

        }else if(evt.equals(txt3)){

            if(!Character.isDigit(event.getCharacter().charAt(0)) && !Character.isLetter(event.getCharacter().charAt(0))
                    && !event.getCharacter().equals(" ")){
                event.consume();
            }

        }else if(evt.equals(txt4)){

            if(txt4.getText().length() > 7){
                event.consume();
            }

        }

    }

/*
    @FXML
    private void eventButton(ActionEvent event){

        JOptionPane.showMessageDialog(null, "Hola Mundo ");
    }




    }

}*/