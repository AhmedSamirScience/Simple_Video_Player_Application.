package wallpaperphptos.macospace.com.ninetta.FullScreen_Content;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.MediaController;

import wallpaperphptos.macospace.com.ninetta.R;
import wallpaperphptos.macospace.com.ninetta.Video_Content.HomeActivity;


public class FullScreenMediaController extends MediaController {

    private ImageButton fullScreen;
    private String isFullScreen;
    private int Method_Number = 0 ;
    public FullScreenMediaController(Context context, int Method_Number) {
        super(context);
        this.Method_Number = Method_Number;
    }

   
        //add listener to image button to handle full screen and exit full screen events
        fullScreen.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(Method_Number == 1)
                {
                         Intent intentFullScreen = new Intent(getContext(), FullScreenActivity.class);
                        ((Activity) getContext()).startActivity(intentFullScreen);
                }

                if(Method_Number == 2)
                {
                         Intent intentFullScreenExit = new Intent(getContext(), HomeActivity.class);
                        ((Activity) getContext()).startActivity(intentFullScreenExit);
                }
            }
        });
    }
}
