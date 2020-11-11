package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyFrame extends JFrame implements ActionListener {
    private JLabel title;

    private JLabel labelQuestion1;
    private JRadioButton answer1Question1;
    private JRadioButton answer2Question1;
    private JRadioButton answer3Question1;
    private JRadioButton answer4Question1;
    private ButtonGroup answersQuestion1;

    private JLabel labelQuestion2;

    private JRadioButton answer1Question2;
    private JRadioButton answer2Question2;
    private JRadioButton answer3Question2;
    private JRadioButton answer4Question2;
    private ButtonGroup answersQuestion2;

    private JLabel labelQuestion3;
    private JRadioButton answer1Question3;
    private JRadioButton answer2Question3;
    private JRadioButton answer3Question3;
    private JRadioButton answer4Question3;
    private ButtonGroup answersQuestion3;

    private JLabel labelQuestion4;
    private JRadioButton answer1Question4;
    private JRadioButton answer2Question4;
    private JRadioButton answer3Question4;
    private JRadioButton answer4Question4;
    private ButtonGroup answersQuestion4;

    private JLabel labelQuestion5;
    private JRadioButton answer1Question5;
    private JRadioButton answer2Question5;
    private JRadioButton answer3Question5;
    private JRadioButton answer4Question5;
    private ButtonGroup answersQuestion5;

    private Container container;
    private JLabel refactor;
    private JButton buttonSave;

    public MyFrame() {
        setTitle("Registration Form");
        setBounds(900, 900, 900, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);

        title = new JLabel("World of Warcraft Questions :D");
        title.setFont(new Font("Colibri", Font.PLAIN, 30));
        title.setSize(500, 30);
        title.setLocation(200, 30);
        container.add(title);

        labelQuestion1 = new JLabel("1 What is the nickname of Varian Wrynn? ");
        labelQuestion1.setFont(new Font("Colibri", Font.PLAIN, 20));
        labelQuestion1.setSize(500, 20);
        labelQuestion1.setLocation(90, 100);
        container.add(labelQuestion1);

        answer1Question1 = new JRadioButton("Nazgrim");
        answer1Question1.setFont(new Font("Colibri", Font.PLAIN, 15));
        answer1Question1.setSelected(true);
        answer1Question1.setSize(100, 20);
        answer1Question1.setLocation(100, 130);
        container.add(answer1Question1);

        answer2Question1 = new JRadioButton("Log'ash");
        answer2Question1.setFont(new Font("Colibri", Font.PLAIN, 15));
        answer2Question1.setSelected(true);
        answer2Question1.setSize(100, 20);
        answer2Question1.setLocation(200, 130);
        container.add(answer2Question1);

        answer3Question1 = new JRadioButton("Saurfang");
        answer3Question1.setFont(new Font("Colibri", Font.PLAIN, 15));
        answer3Question1.setSelected(true);
        answer3Question1.setSize(100, 20);
        answer3Question1.setLocation(300, 130);
        container.add(answer3Question1);

        answer4Question1 = new JRadioButton("BloodHoof");
        answer4Question1.setFont(new Font("Colibri", Font.PLAIN, 15));
        answer4Question1.setSelected(true);
        answer4Question1.setSize(100, 20);
        answer4Question1.setLocation(400, 130);
        container.add(answer4Question1);

        answersQuestion1 = new ButtonGroup();
        answersQuestion1.add(answer1Question1);
        answersQuestion1.add(answer2Question1);
        answersQuestion1.add(answer3Question1);
        answersQuestion1.add(answer4Question1);

        labelQuestion2 = new JLabel("2 Who Founded Orgrimmar? ");
        labelQuestion2.setFont(new Font("Colibri", Font.PLAIN, 20));
        labelQuestion2.setSize(500, 30);
        labelQuestion2.setLocation(90, 150);
        container.add(labelQuestion2);

        answer1Question2 = new JRadioButton("Thrall");
        answer1Question2.setFont(new Font("Colibri", Font.PLAIN, 15));
        answer1Question2.setSelected(true);
        answer1Question2.setSize(100, 15);
        answer1Question2.setLocation(100, 190);
        container.add(answer1Question2);

        answer2Question2 = new JRadioButton("Arthas");
        answer2Question2.setFont(new Font("Colibri", Font.PLAIN, 15));
        answer2Question2.setSelected(true);
        answer2Question2.setSize(100, 15);
        answer2Question2.setLocation(200, 190);
        container.add(answer2Question2);

        answer3Question2 = new JRadioButton("Mafurion");
        answer3Question2.setFont(new Font("Colibri", Font.PLAIN, 15));
        answer3Question2.setSelected(true);
        answer3Question2.setSize(100, 15);
        answer3Question2.setLocation(300, 190);
        container.add(answer3Question2);

        answer4Question2 = new JRadioButton("Borxigar");
        answer4Question2.setFont(new Font("Colibri", Font.PLAIN, 15));
        answer4Question2.setSelected(true);
        answer4Question2.setSize(100, 20);
        answer4Question2.setLocation(400, 190);
        container.add(answer4Question2);

        answersQuestion2 = new ButtonGroup();
        answersQuestion2.add(answer1Question2);
        answersQuestion2.add(answer2Question2);
        answersQuestion2.add(answer3Question2);
        answersQuestion2.add(answer4Question2);

        labelQuestion3 = new JLabel("3 Who Killed Mannaroth and freed the orcs? ");
        labelQuestion3.setFont(new Font("Colibri", Font.PLAIN, 20));
        labelQuestion3.setSize(500, 30);
        labelQuestion3.setLocation(90, 210);
        container.add(labelQuestion3);

        answer1Question3 = new JRadioButton("Garrosh Hellscream");
        answer1Question3.setFont(new Font("Colibri", Font.PLAIN, 15));
        answer1Question3.setSelected(true);
        answer1Question3.setSize(165, 20);
        answer1Question3.setLocation(100, 250);
        container.add(answer1Question3);

        answer2Question3 = new JRadioButton("Varok Saurfang");
        answer2Question3.setFont(new Font("Colibri", Font.PLAIN, 15));
        answer2Question3.setSelected(true);
        answer2Question3.setSize(140, 20);
        answer2Question3.setLocation(265, 250);
        container.add(answer2Question3);

        answer3Question3 = new JRadioButton("Grommash Hellscream");
        answer3Question3.setFont(new Font("Colibri", Font.PLAIN, 15));
        answer3Question3.setSelected(true);
        answer3Question3.setSize(180, 20);
        answer3Question3.setLocation(410, 250);
        container.add(answer3Question3);

        answer4Question3 = new JRadioButton("Durotan ");
        answer4Question3.setFont(new Font("Colibri", Font.PLAIN, 15));
        answer4Question3.setSelected(true);
        answer4Question3.setSize(100, 20);
        answer4Question3.setLocation(600, 250);
        container.add(answer4Question3);

        answersQuestion3 = new ButtonGroup();
        answersQuestion3.add(answer1Question3);
        answersQuestion3.add(answer2Question3);
        answersQuestion3.add(answer3Question3);
        answersQuestion3.add(answer4Question3);

        labelQuestion4 = new JLabel("4 Who wears the Lich King Helmet? ");
        labelQuestion4.setFont(new Font("Colibri", Font.PLAIN, 20));
        labelQuestion4.setSize(500, 30);
        labelQuestion4.setLocation(90, 290);
        container.add(labelQuestion4);

        answer1Question4 = new JRadioButton("Ner'zhul");
        answer1Question4.setFont(new Font("Colibri", Font.PLAIN, 15));
        answer1Question4.setSelected(true);
        answer1Question4.setSize(100, 20);
        answer1Question4.setLocation(100, 320);
        container.add(answer1Question4);

        answer2Question4 = new JRadioButton("Sylvanas windrunner");
        answer2Question4.setFont(new Font("Colibri", Font.PLAIN, 15));
        answer2Question4.setSelected(true);
        answer2Question4.setSize(170, 20);
        answer2Question4.setLocation(200, 320);
        container.add(answer2Question4);

        answer3Question4 = new JRadioButton("Arthas Menethil");
        answer3Question4.setFont(new Font("Colibri", Font.PLAIN, 15));
        answer3Question4.setSelected(true);
        answer3Question4.setSize(130, 20);
        answer3Question4.setLocation(370, 320);
        container.add(answer3Question4);

        answer4Question4 = new JRadioButton("No one,It's Destoyed");
        answer4Question4.setFont(new Font("Colibri", Font.PLAIN, 15));
        answer4Question4.setSelected(true);
        answer4Question4.setSize(170, 20);
        answer4Question4.setLocation(500, 320);
        container.add(answer4Question4);

        answersQuestion4 = new ButtonGroup();
        answersQuestion4.add(answer1Question4);
        answersQuestion4.add(answer2Question4);
        answersQuestion4.add(answer3Question4);
        answersQuestion4.add(answer4Question4);

        labelQuestion5 = new JLabel("5 What was the mane of the Sword wielded by the Lich King? ");
        labelQuestion5.setFont(new Font("Colibri", Font.PLAIN, 20));
        labelQuestion5.setSize(600, 30);
        labelQuestion5.setLocation(90, 350);
        container.add(labelQuestion5);

        answer1Question5 = new JRadioButton("Gorehowl");
        answer1Question5.setFont(new Font("Colibri", Font.PLAIN, 15));
        answer1Question5.setSelected(true);
        answer1Question5.setSize(100, 20);
        answer1Question5.setLocation(100, 380);
        container.add(answer1Question5);

        answer2Question5 = new JRadioButton("Ashbringer");
        answer2Question5.setFont(new Font("Colibri", Font.PLAIN, 15));
        answer2Question5.setSelected(true);
        answer2Question5.setSize(103, 20);
        answer2Question5.setLocation(200, 380);
        container.add(answer2Question5);

        answer3Question5 = new JRadioButton("Frostmourne");
        answer3Question5.setFont(new Font("Colibri", Font.PLAIN, 15));
        answer3Question5.setSelected(true);
        answer3Question5.setSize(110, 20);
        answer3Question5.setLocation(300, 380);
        container.add(answer3Question5);

        answer4Question5 = new JRadioButton("Shalamayne");
        answer4Question5.setFont(new Font("Colibri", Font.PLAIN, 15));
        answer4Question5.setSelected(true);
        answer4Question5.setSize(120, 20);
        answer4Question5.setLocation(420, 380);
        container.add(answer4Question5);

        answersQuestion5 = new ButtonGroup();
        answersQuestion5.add(answer1Question5);
        answersQuestion5.add(answer2Question5);
        answersQuestion5.add(answer3Question5);
        answersQuestion5.add(answer4Question5);

        buttonSave = new JButton("Save");
        buttonSave.setFont(new Font("Colibri", Font.PLAIN, 15));
        buttonSave.setSize(100, 20);
        buttonSave.setLocation(350, 500);
        buttonSave.addActionListener(this);
        container.add(buttonSave);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonSave) {
            String answer1;
            String answer2;
            String answer3;
            String answer4;
            String answer5;
            Integer numberOfCorrectAnswers=0;
            Integer numberOfWrongAnswears=0;
            if(answer2Question1.isSelected())
            {
                answer1="You are right! :)";
                numberOfCorrectAnswers++;
            }
            else
            {
                answer1="You are Wrong :(";
                numberOfWrongAnswears++;
            }

            if(answer1Question2.isSelected())
            {
                answer2="You are right! :)";
                numberOfCorrectAnswers++;
            }
            else
            {answer2="You are Wrong :(";
                numberOfWrongAnswears++;
            }

            if(answer3Question3.isSelected())
            {
                answer3="You are right! :)";
                numberOfCorrectAnswers++;
            }
            else
            {
                answer3="You are Wrong :(";
                numberOfWrongAnswears++;
            }

            if(answer4Question4.isSelected())
            {
                answer4="You are right! :)";
                numberOfCorrectAnswers++;
            }
            else
            {
                answer4="You are Wrong :(";
                numberOfWrongAnswears++;
            }

            if(answer3Question5.isSelected())
            {
                answer5="You are right! :)";
                numberOfCorrectAnswers++;
            }
            else
            {
                answer5="You are Wrong :(";
                numberOfWrongAnswears++;
            }

            container.removeAll();
            container.revalidate();
            container.repaint();

            labelQuestion1 = new JLabel("1 What is the nickname of Varian Wrynn? ");
            labelQuestion1.setFont(new Font("Colibri", Font.PLAIN, 20));
            labelQuestion1.setSize(500, 30);
            labelQuestion1.setLocation(90, 100);
            container.add(labelQuestion1);

            refactor = new JLabel(answer1);
            refactor.setFont(new Font("Colibri", Font.PLAIN, 20));
            refactor.setSize(500, 30);
            refactor.setLocation(90, 140);
            container.add(refactor);

            refactor = new JLabel("correct answer: Lo'gosh");
            refactor.setFont(new Font("Colibri", Font.PLAIN, 20));
            refactor.setSize(500, 30);
            refactor.setLocation(90, 180);
            container.add(refactor);

            labelQuestion2 = new JLabel("2 Who Founded Orgrimmar? ");
            labelQuestion2.setFont(new Font("Colibri", Font.PLAIN, 20));
            labelQuestion2.setSize(500, 30);
            labelQuestion2.setLocation(90, 220);
            container.add(labelQuestion2);

            refactor = new JLabel(answer2);
            refactor.setFont(new Font("Colibri", Font.PLAIN, 20));
            refactor.setSize(500, 30);
            refactor.setLocation(90, 260);
            container.add(refactor);

            refactor = new JLabel("correct answer: Thrall");
            refactor.setFont(new Font("Colibri", Font.PLAIN, 20));
            refactor.setSize(500, 30);
            refactor.setLocation(90, 300);
            container.add(refactor);

            labelQuestion3 = new JLabel("3 Who Killed Mannaroth and freed the orcs?  ");
            labelQuestion3.setFont(new Font("Colibri", Font.PLAIN, 20));
            labelQuestion3.setSize(500, 30);
            labelQuestion3.setLocation(90, 340);
            container.add(labelQuestion3);

            refactor = new JLabel(answer3);
            refactor.setFont(new Font("Colibri", Font.PLAIN, 20));
            refactor.setSize(500, 30);
            refactor.setLocation(90, 380);
            container.add(refactor);

            refactor = new JLabel("correct answer: Grommash Hellscream");
            refactor.setFont(new Font("Colibri", Font.PLAIN, 20));
            refactor.setSize(500, 30);
            refactor.setLocation(90, 420);
            container.add(refactor);

            labelQuestion4 = new JLabel("4 Who wears the Lich King Helmet? ");
            labelQuestion4.setFont(new Font("Colibri", Font.PLAIN, 20));
            labelQuestion4.setSize(500, 30);
            labelQuestion4.setLocation(90, 460);
            container.add(labelQuestion4);

            refactor = new JLabel(answer4);
            refactor.setFont(new Font("Colibri", Font.PLAIN, 20));
            refactor.setSize(500, 30);
            refactor.setLocation(90, 500);
            container.add(refactor);

            refactor = new JLabel("correct answer: No one,Its Destoyed");
            refactor.setFont(new Font("Colibri", Font.PLAIN, 20));
            refactor.setSize(500, 30);
            refactor.setLocation(90, 540);
            container.add(refactor);

            labelQuestion5 = new JLabel("5 What was the mane of the Sword wielded by the Lich King? ");
            labelQuestion5.setFont(new Font("Colibri", Font.PLAIN, 20));
            labelQuestion5.setSize(600, 30);
            labelQuestion5.setLocation(90, 580);
            container.add(labelQuestion5);

            refactor = new JLabel(answer5);
            refactor.setFont(new Font("Colibri", Font.PLAIN, 20));
            refactor.setSize(500, 30);
            refactor.setLocation(90, 620);
            container.add(refactor);

            refactor = new JLabel("correct answer: Frostmourne");
            refactor.setFont(new Font("Colibri", Font.PLAIN, 20));
            refactor.setSize(500, 30);
            refactor.setLocation(90, 650);
            container.add(refactor);

            refactor = new JLabel("Number of Correct Answers: "+numberOfCorrectAnswers);
            refactor.setFont(new Font("Colibri", Font.PLAIN, 20));
            refactor.setSize(500, 30);
            refactor.setLocation(90, 680);
            container.add(refactor);

            refactor = new JLabel("Number of Wrong Answers: "+numberOfWrongAnswears);
            refactor.setFont(new Font("Colibri", Font.PLAIN, 20));
            refactor.setSize(500, 30);
            refactor.setLocation(90, 700);
            container.add(refactor);

            refactor = new JLabel("Correct Percentage: "+(100*numberOfCorrectAnswers)/(numberOfCorrectAnswers+numberOfWrongAnswears)+"%");
            refactor.setFont(new Font("Colibri", Font.PLAIN, 20));
            refactor.setSize(500, 30);
            refactor.setLocation(90, 720);
            container.add(refactor);


            setVisible(true);
        }
    }

}

