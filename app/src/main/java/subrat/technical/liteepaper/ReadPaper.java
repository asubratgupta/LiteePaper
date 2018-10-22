package subrat.technical.liteepaper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;

import static subrat.technical.liteepaper.ChooseCity.cityVar;
import static subrat.technical.liteepaper.MainActivity.accuDate;
import static subrat.technical.liteepaper.MainActivity.accuMonth;
import static subrat.technical.liteepaper.MainActivity.accuPage;
import static subrat.technical.liteepaper.MainActivity.completeURL;
import static subrat.technical.liteepaper.MainActivity.page;
import static subrat.technical.liteepaper.MainActivity.selectedPaper;
import static subrat.technical.liteepaper.MainActivity.webView;
import static subrat.technical.liteepaper.MainActivity.year;

public class ReadPaper extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_paper);

        updateValue();

    }

    @Override
    public void onBackPressed() {
        try {
            if (selectedPaper == "amarujala") {
                Intent intent = new Intent(ReadPaper.this, ChooseCity.class);
                page = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(ReadPaper.this, MainActivity.class);
                page = 1;
                startActivity(intent);
            }
        }catch (Exception e){
            Log.e("Read Paper", e.getMessage());
        }


    }

    /**
     * \
     * Page Increament & Decreament Methods
     */
    private View.OnClickListener pageincreaseListener = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                MainActivity.showInterestial();
                // Next Page
                if (page < 40) {
                    page++;
                    updateValue();
                }
            }catch (Exception e){
                Log.e("Read Paper", e.getMessage());
            }

        }
    };

    private View.OnClickListener pagedecreaseListener = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                MainActivity.showInterestial();
                // Previous Page
                if (page > 1) {
                    page--;
                    updateValue();
                }
            }catch (Exception e){
                Log.e("Read Paper", e.getMessage());
            }

        }
    };

    /**
     * This method will update all ePaper content on Screen
     */

    private void update() {
        try {
            if (selectedPaper == "amarujala") {
                setContentView(R.layout.activity_read_paper);
                Button pageplus = (Button) findViewById(R.id.pageplus);
                pageplus.setOnClickListener(pageincreaseListener);

                Button pageminus = (Button) findViewById(R.id.pageminus);
                pageminus.setOnClickListener(pagedecreaseListener);

            } else {
                LinearLayout preNexButtonPanel = (LinearLayout) findViewById(R.id.preNexButtonPanel);
                preNexButtonPanel.setVisibility(View.GONE);
            }

            webView = (WebView) findViewById(R.id.webview);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setFocusable(true);
            webView.setFocusableInTouchMode(true);
            webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
            webView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
            webView.getSettings().setDomStorageEnabled(true);
            webView.getSettings().setDatabaseEnabled(true);
            webView.getSettings().setAppCacheEnabled(true);
            webView.getSettings().setBuiltInZoomControls(true);
            webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
            webView.setWebViewClient(new WebViewClient());
            webView.setInitialScale(100);
            webView.loadUrl(completeURL);
            MainActivity.showInterestial();
        }catch (Exception e){
            Log.e("Read Paper", e.getMessage());
        }

    }


    private void updateValue() {
        try {
            switch (selectedPaper) {
                case "haribhumi":
                    completeURL = "http://epaper.haribhoomi.com";
                    update();
                    break;
                case "amarujala":
                    //http://epaper.amarujala.com/2017/08/29/ac/01/hdimage.jpg
                    accuPage = String.format("%02d", page);
                    completeURL = "http://epaper.amarujala.com/" + year + "/" + accuMonth + "/" + accuDate + "/" + cityVar + "/" + accuPage + "/hdimage.jpg";
                    update();
                    break;  //optional
                case "jagran":
                    completeURL = "http://epaper.jagran.com/homepage.aspx";
                    update();
                    break;
                case "dainikbhaskar":
                    completeURL = "http://epaper.bhaskar.com";
                    update();
                    break;
                case "hindustan":
                    completeURL = "http://epaper.livehindustan.com";
                    update();
                    break;
                case "jansatta":
                    completeURL = "http://epaper.jansatta.com";
                    update();
                    break;
                case "loktej":
                    completeURL = "http://epaper.loktej.com";
                    update();
                    break;
                case "naidunia":
                    completeURL = "http://naiduniaepaper.jagran.com/homepage.aspx";
                    update();
                    break;
                case "prabhatkhabar":
                    completeURL = "http://epaper.prabhatkhabar.com";
                    update();
                    break;
                case "punjabkesari":
                    completeURL = "http://epaper.punjabkesari.in";
                    update();
                    break;
                case "nbt":
                    completeURL = "http://epaper.navbharattimes.com";
                    update();
                    break;
                case "patrika":
                    completeURL = "http://epaper.patrika.com";
                    update();
                    break;
            }
        }catch (Exception e){
            Log.e("Read Paper", e.getMessage());
        }

    }
}
