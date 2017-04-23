package com.example.natbe.hypeyolyfe;

import android.app.AlertDialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ChooseYourHype extends AppCompatActivity {

    public void callDialog(final int typeOfHype, final int index) {
        /*
        * HYPE TYPES
        * 1 - general
        * 2 - workout
        * 3 - date
        * 4 - after dark
        * 5 - study
        * 6 - party
        * */
        AlertDialog.Builder builder = new AlertDialog.Builder(ChooseYourHype.this);
        List<String> messages = new ArrayList<String>();
        switch (typeOfHype) {
            case 1:
                messages = Arrays.asList("YOU ARE AWESOME!", "Never let anyone treat you like" +
                        " a yellow starburst. You are a pink starburst!", "Good job being you!", "They should put you in the" +
                        " sky because you are a star!", "If Chuck Norris could see you now, HE would impressed!", "YOU GOT THIS!",
                        "2 4 6 8 Who do we appreciate?!\nYOU!",  "Haters gonna hate.", "Don’t be sad because sad backwards is " +
                                "das and das not good", "You did NOT wake up today to be mediocre!","It's called a trashCAN " +
                                "not a trashcan't", "Life is tough my darling, but so are you!");
                break;
            case 2:
                messages = Arrays.asList("You are strong, like a Romainian weight lifter.", "You are only " +
                        "one workout away from a good mood", "Pain is weakness leaving the body", "JUST DO IT!!",
                        "Imagine all the calories you burn goes to the person you hate","YOU'RE A BEAST!",
                        "Wake up with determination, go to sleep with satisfaction", "Think about that blue ribbon",
                        "One day closer to looking like John Cena");
                break;
            case 3:
                messages = Arrays.asList("They are SO TOTALLY INTO YOU!", "You are looking fiinneee!","You " +
                        "never know until you try; so go in for that kiss!", "Look into the mirror say wassup",
                        "Flex, baby, flex","No matter what happens, you'll always have food", "They are lucky  " +
                                "to be going on a date you","You can totally fit into that outfit!","Obviously, " +
                                "you're great enough for them to go out with you");
                break;
            case 4:
                messages = Arrays.asList("Hump it off.",  "When you feel like giving up remember you have a lot of motherfuckers" +
                        " to prove wrong!", "Just fuck it out.", "The only thing that should be down is you on them.",
                        "They say physical touch makes people feel better, so get naked and maximize it.", "Never Gonna Give You Up - Rick Astley");
                break;
            case 5:
                messages = Arrays.asList("You will ACE this test!","Keep studying, it will be worth it soon!",
                        "Work hard now so your dog can have a good life later!","You are one day closer to graduation",
                        "One homework problem now, 3 mansions later","Just a little bit longer so you can treat yo self", "Study like a BOSS!",
                        "A's are sexy", "You shall pass!", "You know where I see you in five years? Standing in the spotlight" +
                                " telling everyone the story of your success.", "Only a few more questions!" );
                break;
            case 6:
                messages = Arrays.asList("Your dance moves are fire!", "Don’t worry, you definitely" +
                        " won’t be the ugliest one there.", "LOOKIN GOOD ;)", "Why be moody when you can" +
                        " shake your booty?!","Make it LIT!", "You can totally fit into that outfit!", "You're like a mullet, " +
                        "business in the front, party in the back", "booty, booty, booty, booty!", "You aren't going " +
                        "to a party, you are the party");
        }

        final int size = messages.size();
        String response = messages.get(index);
        builder.setMessage(response);

        builder.setPositiveButton("I am now hyped", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {

            }
        });

        builder.setNegativeButton("I am not hyped yet", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                if (index == size - 1){
                    callDialog(typeOfHype, 0);
                }else {
                    callDialog(typeOfHype, index + 1);
                }
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_your_hype);
        Button general = (Button) findViewById(R.id.General);
        Button workout = (Button) findViewById(R.id.Workout);
        Button date = (Button) findViewById(R.id.Date);
        Button afterDark = (Button) findViewById(R.id.AfterDark);
        Button study = (Button) findViewById(R.id.Study);
        Button party = (Button) findViewById(R.id.Party);

        general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callDialog(1, 0);
            }

        });

        workout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callDialog(2, 0);
            }

        });

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callDialog(3, 0);
            }

        });

        afterDark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callDialog(4, 0);
            }

        });
        study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callDialog(5, 0);
            }

        });
        party.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callDialog(6, 0);
            }

        });
        // ATTENTION: This was auto-generated to handle app links.
//        Intent appLinkIntent = getIntent();
//        String appLinkAction = appLinkIntent.getAction();
//        Uri appLinkData = appLinkIntent.getData();
    }
}
