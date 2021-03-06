package com.example.android.tamilapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> phrases = new ArrayList<>();

        phrases.add(new Word("How are you?","எப்படி இருக்கின்றீர்கள்"));
        phrases.add(new Word("What's your name?","உங்கள் பெயர் என்ன?"));
        phrases.add(new Word("Where are you from?","உங்கள் சொந்த ஊர் எது?"));
        phrases.add(new Word("Have a nice day","இந்த நாள் இனிய நாளாக அமையட்டும்"));
        phrases.add(new Word("How much is this?","இது எவ்வளவு"));
        phrases.add(new Word("Thank you","நன்றி"));
        phrases.add(new Word("Would you like to eat anything?","நீங்கள் எதையும் சாப்பிட விரும்புகிறீர்களா?"));
        phrases.add(new Word("How long do you work here?","நீங்கள் இங்கே எவ்வளவு காலம் வேலை செய்கிறீர்கள்?"));
        phrases.add(new Word("He is such a nice person","அவர் ஒரு நல்ல மனிதர்"));
        phrases.add(new Word("Pleased to meet you","உங்களை பார்த்தது மிகவும் சந்தோஷம்"));

        // Create an instance for Custom Array Adapter(In this case WordAdapter)
        // (ArrayAdapter - adapter converts an ArrayList of objects into View items loaded into the ListView container)
        WordAdapter itemsAdapter = new WordAdapter(this, phrases, R.color.category_phrases);

        // Connect the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
    
    
}
