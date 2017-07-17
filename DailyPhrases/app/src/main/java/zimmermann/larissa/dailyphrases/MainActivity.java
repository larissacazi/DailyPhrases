package zimmermann.larissa.dailyphrases;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView newPhrase;
    private Button generatorButton;

    private String[] phrases = {
            "Don't cry because it's over, smile because it happened.",
            "You only live once, but if you do it right, once is enough.",
            "In three words I can sum up everything I've learned about life: it goes on.",
            "To live is the rarest thing in the world. Most people exist, that is all.",
            "It is better to be hated for what you are than to be loved for what you are not.",
            "I may not have gone where I intended to go, but I think I have ended up where I needed to be.",
            "Life isn't about finding yourself. Life is about creating yourself.",
            "Some infinities are bigger than other infinities.",
            "Life is like riding a bicycle. To keep your balance, you must keep moving."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newPhrase = (TextView) findViewById(R.id.phrasesId);
        generatorButton = (Button) findViewById(R.id.buttonNewPhraseGenerator);

        newPhrase.setText("");

        generatorButton.setOnClickListener(new View.OnClickListener() {
            Random number = new Random();

            @Override
            public void onClick(View v) {
                newPhrase.setText(phrases[number.nextInt(phrases.length)]);
            }
        });
    }
}
