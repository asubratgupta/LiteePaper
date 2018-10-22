package subrat.technical.liteepaper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    // All Variables Declaration

    public static String selectedPaper;
    public static WebView webView;
    public static int date;
    public static int month;
    public static int year;
    public static int page = 1;
    public static String accuPage;
    public static String accuDate;
    public static String accuMonth;
    public static String accuYear;
    public static String completeURL = "http://google.com";
    public static InterstitialAd mInterstitialAd;
    public static Context context;

    @Override
    public void onBackPressed() {
        try {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } catch (Exception e) {
            Log.e("Main Activity", e.getMessage());
        }

    }

    /**
     * onCreate Method
     * It will execute automatically with main activity
     *
     * @param savedInstanceState
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            Date todayDate = new Date();
            year = todayDate.getYear() + 1900;
            month = todayDate.getMonth() + 1;
            date = todayDate.getDate();
            accuPage = String.format("%02d", page);
            accuDate = String.format("%02d", date);
            accuMonth = String.format("%02d", month);
            accuYear = String.format("%04d", year);

            context = getApplicationContext();
/**
 * Creating Objects Of ImageButtons & Calling Relavant Method
 */

            CardView haribhumi = (CardView) findViewById(R.id.haribhumi);
            haribhumi.setOnClickListener(haribhumiListener);

            CardView amarujala = (CardView) findViewById(R.id.amarujala);
            amarujala.setOnClickListener(amarujalaListener);

            CardView jagran = (CardView) findViewById(R.id.jagran);
            jagran.setOnClickListener(jagranListener);

            CardView dainikbhaskar = (CardView) findViewById(R.id.dainikbhaskar);
            dainikbhaskar.setOnClickListener(dainikbhaskarListener);

            CardView hindustan = (CardView) findViewById(R.id.hindustan);
            hindustan.setOnClickListener(hindustanListener);

            CardView jansatta = (CardView) findViewById(R.id.jansatta);
            jansatta.setOnClickListener(jansattaListener);

            CardView naidunia = (CardView) findViewById(R.id.naidunia);
            naidunia.setOnClickListener(naiduniaListener);

            CardView patrika = (CardView) findViewById(R.id.patrika);
            patrika.setOnClickListener(patrikaListener);

            CardView loktej = (CardView) findViewById(R.id.loktej);
            loktej.setOnClickListener(loktejListener);

            CardView nbt = (CardView) findViewById(R.id.nbt);
            nbt.setOnClickListener(nbtListener);

            CardView prabhatkhabar = (CardView) findViewById(R.id.prabhatkhabar);
            prabhatkhabar.setOnClickListener(prabhatkhabarListener);

            CardView punjabkesari = (CardView) findViewById(R.id.punjabkesari);
            punjabkesari.setOnClickListener(punjabkesariListener);

            mInterstitialAd = new InterstitialAd(context);
            mInterstitialAd.setAdUnitId("ca-app-pub-9523728368608700/8797296311");
            showInterestial();

            //Load an ad into the AdMob banner view.
            AdView adView = (AdView) findViewById(R.id.adView);
            AdRequest adRequest = new AdRequest.Builder()
                    .setRequestAgent("android_studio:ad_template").build();
            adView.loadAd(adRequest);
        } catch (Exception e) {
            Log.e("Main Activity", e.getMessage());
        }



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        try {
// Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.share) {
                try {
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("text/plain");
                    i.putExtra(Intent.EXTRA_SUBJECT, "All ePaper Newspaper");
                    String sAux = "\nGet any newspaper in actual paper's form and it is completely free.\n\n";
                    sAux = sAux + "https://play.google.com/store/apps/details?id=subrat.technical.liteepaper \n\n";
                    i.putExtra(Intent.EXTRA_TEXT, sAux);
                    startActivity(Intent.createChooser(i, "choose one"));
                } catch(Exception e) {
                    //e.toString();
                }
                return true;
            }

        } catch (Exception e) {
            Log.e("Main Activity", e.getMessage());
        }
        return super.onOptionsItemSelected(item);

    }

    /**
     * onClickListeners Of all buttons.
     */


    private View.OnClickListener haribhumiListener = new View.OnClickListener() {
        public void onClick(View v) {
            nextActivity("haribhumi");
        }
    };

    private View.OnClickListener amarujalaListener = new View.OnClickListener() {
        public void onClick(View v) {
            chooseCity("amarujala");
        }
    };

    private View.OnClickListener jagranListener = new View.OnClickListener() {
        public void onClick(View v) {
            nextActivity("jagran");
        }
    };

    private View.OnClickListener dainikbhaskarListener = new View.OnClickListener() {
        public void onClick(View v) {
            nextActivity("dainikbhaskar");
        }
    };

    private View.OnClickListener hindustanListener = new View.OnClickListener() {
        public void onClick(View v) {
            nextActivity("hindustan");
        }
    };

    private View.OnClickListener jansattaListener = new View.OnClickListener() {
        public void onClick(View v) {
            nextActivity("jansatta");
        }
    };

    private View.OnClickListener loktejListener = new View.OnClickListener() {
        public void onClick(View v) {
            nextActivity("loktej");
        }
    };

    private View.OnClickListener naiduniaListener = new View.OnClickListener() {
        public void onClick(View v) {
            nextActivity("naidunia");
        }
    };

    private View.OnClickListener nbtListener = new View.OnClickListener() {
        public void onClick(View v) {
            nextActivity("nbt");
        }
    };

    private View.OnClickListener prabhatkhabarListener = new View.OnClickListener() {
        public void onClick(View v) {
            nextActivity("prabhatkhabar");
        }
    };

    private View.OnClickListener punjabkesariListener = new View.OnClickListener() {
        public void onClick(View v) {
            nextActivity("punjabkesari");
        }
    };

    private View.OnClickListener patrikaListener = new View.OnClickListener() {
        public void onClick(View v) {
            nextActivity("patrika");
        }
    };

    private void chooseCity(String paper) {
        try {
            selectedPaper = paper;
            Intent intent = new Intent(MainActivity.this, ChooseCity.class);
            startActivity(intent);
        } catch (Exception e) {
            Log.e("Main Activity", e.getMessage());
        }

    }

    public void nextActivity(String paper) {
        try {
            selectedPaper = paper;
            Intent intent = new Intent(MainActivity.this, ReadPaper.class);
            startActivity(intent);
        } catch (Exception e) {
            Log.e("Main Activity", e.getMessage());
        }

    }

    public static void showInterestial(){

        try {
            if (MainActivity.mInterstitialAd.isLoaded()) {
                MainActivity.mInterstitialAd.show();
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.");
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        } catch (Exception e) {
            Log.e("Main Activity", e.getMessage());
        }


    }
}