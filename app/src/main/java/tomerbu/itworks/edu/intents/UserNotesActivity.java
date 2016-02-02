package tomerbu.itworks.edu.intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class UserNotesActivity extends AppCompatActivity {

    public static final String EXTRA_NOTE_TITLE = "Note Title";
    public static final String EXTRA_NOTE_CONTENT = "Note Content";
    public static final String EXTRA_NOTE_AMOUNT = "Notes Amount";

    private TextView tvNoteTitle,
                     tvNotesContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_notes);

        tvNotesContent = (TextView)findViewById(R.id.tvNoteContent);
        tvNoteTitle = (TextView)findViewById(R.id.tvNoteTitle);


        loadDataFromTheIntent();
                /*
                "Notes Amount"
                "Note Title",
                "Note Content"
                * */

    }

    private void loadDataFromTheIntent() {
        Intent mIntent = getIntent();
        String title = mIntent.getStringExtra(EXTRA_NOTE_TITLE);
        String content = mIntent.getStringExtra(EXTRA_NOTE_CONTENT);
        int notesAmount = mIntent.getIntExtra(EXTRA_NOTE_AMOUNT, 1);
        tvNotesContent.setText(content);
        tvNoteTitle.setText(title);
    }

}
