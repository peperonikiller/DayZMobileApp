package org.pwnsro.dayz;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class DayZActivity extends Activity {
	WebView mWebView;
	boolean mFullscreen;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	//requestWindowFeature(Window.FEATURE_NO_TITLE); 
        super.onCreate(savedInstanceState);
        this.getWindow().requestFeature(Window.FEATURE_PROGRESS);
        setContentView(R.layout.main );
        mFullscreen = true;
         mWebView = (WebView) findViewById( R.id.webView1 );
         mWebView.setWebViewClient(new HelloWebViewClient());
         mWebView.getSettings().setJavaScriptEnabled(true);   
         mWebView.getSettings().setSupportZoom(false);
         mWebView.getSettings().setBuiltInZoomControls(false);
         String ua = "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0";
         mWebView.getSettings().setUserAgentString(ua);
         final Activity MyActivity = this;
         mWebView.setWebChromeClient(new WebChromeClient() {
          public void onProgressChanged(WebView view, int progress)   
          {
           MyActivity.setTitle("Loading...");
           MyActivity.setProgress(progress * 100);
              if(progress == 100)
                 MyActivity.setTitle(R.string.app_name);
            }
          });
        
        mWebView.getSettings().setSupportZoom(true);
     	mWebView.getSettings().setBuiltInZoomControls(true);
     	mWebView.getSettings().setLoadWithOverviewMode(true);
     	mWebView.getSettings().setUseWideViewPort(true);
     	mWebView.setInitialScale(50);
     	mWebView.loadUrl("http://dayzwiki.com/wiki/index.php?title=Special:Random");
     	Toast.makeText(this, "Loading Random Page!", Toast.LENGTH_SHORT).show();
     }
     
    
    private class HelloWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
        
    public void map(View view) {
    	mWebView.getSettings().setUserAgentString("Android");
    	mWebView.getSettings().setSupportZoom(false);
    	mWebView.getSettings().setBuiltInZoomControls(false);
    	mWebView.getSettings().setLoadWithOverviewMode(false);
     	mWebView.getSettings().setUseWideViewPort(false);
    	//mWebView.getSettings().setSupportZoom(true);
    	//mWebView.getSettings().setBuiltInZoomControls(true);
    	mWebView.setInitialScale(100);
    	//mWebView.loadUrl("http://www.maplib.net/fullmap.php?id=14454&legend=1");
    	mWebView.loadUrl("http://dayzwiki.com/wiki/Gmap/beta/gmap.html");
    	}
    public void loot(View view) {
    	
    	
    	mWebView.getSettings().setSupportZoom(true);
     	mWebView.getSettings().setBuiltInZoomControls(true);
     	mWebView.getSettings().setLoadWithOverviewMode(true);
     	mWebView.getSettings().setUseWideViewPort(true);
     	String ua = "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0";
        mWebView.getSettings().setUserAgentString(ua);
    	mWebView.loadUrl("http://picacid.com/arma2/loot_en.html");
    	
    	}
    public void weapon(View view) {
    	
    	mWebView.getSettings().setSupportZoom(true);
     	mWebView.getSettings().setBuiltInZoomControls(true);
     	mWebView.getSettings().setLoadWithOverviewMode(true);
     	mWebView.getSettings().setUseWideViewPort(true);
     	String ua = "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0";
        mWebView.getSettings().setUserAgentString(ua);
     	
    	//mWebView.setInitialScale(20);
    	mWebView.loadUrl("http://dayzwiki.com/wiki/index.php?title=Weapons");
    	}
    public void vehicle(View view) {
    	mWebView.getSettings().setSupportZoom(true);
     	mWebView.getSettings().setBuiltInZoomControls(true);
     	mWebView.getSettings().setLoadWithOverviewMode(true);
     	mWebView.getSettings().setUseWideViewPort(true);
     	String ua = "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0";
        mWebView.getSettings().setUserAgentString(ua);
    	//mWebView.setInitialScale(20);
    	mWebView.loadUrl("http://dayzwiki.com/wiki/index.php?title=Vehicles");
    	}
    public void equipment(View view) {
    	mWebView.getSettings().setSupportZoom(true);
     	mWebView.getSettings().setBuiltInZoomControls(true);
     	mWebView.getSettings().setLoadWithOverviewMode(true);
     	mWebView.getSettings().setUseWideViewPort(true);
     	String ua = "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0";
        mWebView.getSettings().setUserAgentString(ua);
    	//mWebView.setInitialScale(20);
    	mWebView.loadUrl("http://dayzwiki.com/wiki/index.php?title=Equipment");
    	}
    public void consume(View view) {
    	mWebView.getSettings().setSupportZoom(true);
     	mWebView.getSettings().setBuiltInZoomControls(true);
     	mWebView.getSettings().setLoadWithOverviewMode(true);
     	mWebView.getSettings().setUseWideViewPort(true);
     	String ua = "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0";
        mWebView.getSettings().setUserAgentString(ua);
    	//mWebView.setInitialScale(20);
    	mWebView.loadUrl("http://dayzwiki.com/wiki/index.php?title=Consumables");
    	}
    public void patch(View view) {
    	mWebView.getSettings().setSupportZoom(true);
     	mWebView.getSettings().setBuiltInZoomControls(true);
     	mWebView.getSettings().setLoadWithOverviewMode(true);
     	mWebView.getSettings().setUseWideViewPort(true);
     	String ua = "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0";
        mWebView.getSettings().setUserAgentString(ua);
    	//mWebView.setInitialScale(20);
    	mWebView.loadUrl("http://dayzwiki.com/wiki/index.php?title=Changelog");
    	}
    public void serverlist(View view) {
    	mWebView.getSettings().setSupportZoom(true);
     	mWebView.getSettings().setBuiltInZoomControls(true);
     	mWebView.getSettings().setLoadWithOverviewMode(true);
     	mWebView.getSettings().setUseWideViewPort(true);
     	String ua = "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0";
        mWebView.getSettings().setUserAgentString(ua);
    	//mWebView.setInitialScale(20);
    	mWebView.loadUrl("http://arma2.swec.se/server/list");
    	}
    public void survive(View view) {
    	mWebView.getSettings().setSupportZoom(true);
     	mWebView.getSettings().setBuiltInZoomControls(true);
     	mWebView.getSettings().setLoadWithOverviewMode(true);
     	mWebView.getSettings().setUseWideViewPort(true);
     	String ua = "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0";
        mWebView.getSettings().setUserAgentString(ua);
    	//mWebView.setInitialScale(20);
    	mWebView.loadUrl("http://dayzwiki.com/wiki/index.php?title=Survival");
    	}
    public void lmap(View view) {
    	mWebView.getSettings().setUserAgentString("Android");
    	mWebView.getSettings().setSupportZoom(false);
    	mWebView.getSettings().setBuiltInZoomControls(false);
    	mWebView.getSettings().setLoadWithOverviewMode(false);
     	mWebView.getSettings().setUseWideViewPort(false);
    	//mWebView.getSettings().setSupportZoom(true);
    	//mWebView.getSettings().setBuiltInZoomControls(true);
    	mWebView.setInitialScale(75);
    	mWebView.loadUrl("http://teamfackin.com/moocow/dayz/map/");
    	//mWebView.loadUrl("http://dayzmap.info/");
    	}
    public void reddit(View view) {
    	mWebView.getSettings().setSupportZoom(true);
     	mWebView.getSettings().setBuiltInZoomControls(true);
     	mWebView.getSettings().setLoadWithOverviewMode(true);
     	mWebView.getSettings().setUseWideViewPort(true);
     	String ua = "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0";
        mWebView.getSettings().setUserAgentString(ua);
    	//mWebView.setInitialScale(20);
    	mWebView.loadUrl("http://i.reddit.com/r/dayz/");
    	}
    
    public void exit(View view) {
    	finish();
    }
    public void onBackPressed () {
        if(mWebView != null) {
            if(mWebView.canGoBack()) {
            	mWebView.goBack();
            } else {
            	AlertDialog.Builder builder = new AlertDialog.Builder(this);
            	builder.setMessage("Are you sure you want to exit?")
            	       .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            	            public void onClick(DialogInterface dialog, int id) {
            	            	finish();
            	            }
            	        })
            	        .setNegativeButton("No", new DialogInterface.OnClickListener() {
            	            public void onClick(DialogInterface dialog, int id) {
            	                // *** Do Nothing ***
            	            }
            	        })
            	        .create().show();
            }
        } else {
        	finish();
        }
    	} 
    
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
        case R.id.item1:
        	finish();
            break;
        case R.id.item3:
        	if(mFullscreen == false) {
        		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
                getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
                mFullscreen = true;
            } else
            {
                
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
                getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
                mFullscreen = false;
                
            }
            break;
        case R.id.item2:
        	AlertDialog.Builder builder = new AlertDialog.Builder(this);
        	builder.setMessage("DayZee uses links from: \ndayzwiki.com\npicacid.com\narma2.swec.se \n\nApp created by Peperonikiller (pwnsro.org)")
        	       .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
        	            public void onClick(DialogInterface dialog, int id) {
        	            	
        	            }
        	        })
        	        .setNegativeButton("Market Page", new DialogInterface.OnClickListener() {
    	            public void onClick(DialogInterface dialog, int id) {
    	            	Intent intent = new Intent(Intent.ACTION_VIEW);
    	            	intent.setData(Uri.parse("market://details?id=org.pwnsro.dayz"));
    	            	startActivity(intent);
    	            }
    	        })
        	        .create().show();
            break;
            }
     
        return true;
    }
}