package in.deepaksood.scoreboard;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import org.json.JSONException;
import org.json.JSONObject;

import in.deepaksood.scoreboard.model_package.CricketDataModel;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromServer(buildQuery("list_player"));

    }

    /*
    Builds Query for GET Request from server
    Ex: http://hackerearth.0x10.info/api/gyanmatrix?type=json&query=list_player
     */
    private String buildQuery(String query) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("http")
                .authority("hackerearth.0x10.info")
                .appendPath("api")
                .appendPath("gyanmatrix")
                .appendQueryParameter("type","json")
                .appendQueryParameter("query",query);

        return builder.build().toString();
    }

    private void getDataFromServer(String url) {
        StringRequest stringRequest = new StringRequest(Request.Method.GET,
                url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.e(TAG,"Success Response: "+response);
                        final Gson gson = new Gson();
                        CricketDataModel cricketDataModel;
                        try {
                            JSONObject rootObject = new JSONObject(response);
                            cricketDataModel = gson.fromJson(rootObject.toString(), CricketDataModel.class);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG,"Error Response: "+error);
            }
        });

        Volley.newRequestQueue(this).add(stringRequest);
    }
}
