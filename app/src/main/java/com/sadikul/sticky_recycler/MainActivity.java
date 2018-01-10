package com.sadikul.sticky_recycler;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.sadikul.sticky_recycler.Adapter.LeagueAdapter;
import com.sadikul.sticky_recycler.Adapter.RecyclerSectionItemDecoration;
import com.sadikul.sticky_recycler.Model.Leagues;
import com.sadikul.sticky_recycler.Network.ApiInterface;
import com.sadikul.sticky_recycler.Network.NetworkClient;

import java.util.ArrayList;
import java.util.Collections;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ArrayList<Leagues> leaguesList;
    private static final String TAG ="MainActivity";
    ProgressDialog progressDialog;

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        leaguesList = new ArrayList<>();
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Please wait..");

        recyclerView = findViewById(R.id.sticky_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        getLeagueList();





    }

    private void getLeagueList(){
        progressDialog.show();
        ApiInterface apiInterface = NetworkClient.getApiInterface();
        Call<ArrayList<Leagues>> call = apiInterface.getLeagueList();
        call.enqueue(new Callback<ArrayList<Leagues>>() {
            @Override
            public void onResponse(Call<ArrayList<Leagues>> call, Response<ArrayList<Leagues>> response) {

                progressDialog.dismiss();
                if(response.isSuccessful()){
                    Log.e(TAG,response.body().toString());
                    leaguesList = response.body();

                    Collections.sort(leaguesList);
                    RecyclerSectionItemDecoration sectionItemDecoration =
                            new RecyclerSectionItemDecoration(getResources().getDimensionPixelSize(R.dimen.recycler_section_header_height),true,getSectionCallback(leaguesList));
                    recyclerView.addItemDecoration(sectionItemDecoration);
                    LeagueAdapter adapter = new LeagueAdapter(getLayoutInflater(),leaguesList,R.layout.recycler_row);
                    recyclerView.setAdapter(adapter);
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<ArrayList<Leagues>> call, Throwable t) {

                progressDialog.dismiss();
                Log.e(TAG,t.getMessage());
            }
        });
    }

    private RecyclerSectionItemDecoration.SectionCallback getSectionCallback(final ArrayList<Leagues> leagues) {
        return new RecyclerSectionItemDecoration.SectionCallback() {
            @Override
            public boolean isSection(int position) {
                return position == 0 || leagues.get(position).getCountry().charAt(0) != leagues.get(position - 1).getCountry().charAt(0);
            }

            @Override
            public CharSequence getSectionHeader(int position) {
                return leagues.get(position).getCountry();
            }
        };
    }
}
