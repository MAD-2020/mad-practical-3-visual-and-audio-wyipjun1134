package sg.edu.np.mad.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView babyPic =findViewById(R.id.babyimageview);
        babyPic.setImageURI(
                Uri.parse("android.resource://" +getPackageName() + "/" +R.raw.cute_baby)
        );
        

        VideoView rabbitVideo = findViewById(R.id.RabbitVideo);
        rabbitVideo.setVideoURI(
                Uri.parse("android.resource://" +getPackageName() + "/" +R.raw.rabbid)
        );
        rabbitVideo.start();
    }
}
