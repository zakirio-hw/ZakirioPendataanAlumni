package pnj.uts.ti.zakirio_hugoraazaq_wasis;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import pnj.uts.ti.zakirio_hugoraazaq_wasis.databinding.ActivityDashboardBinding;
import pnj.uts.ti.zakirio_hugoraazaq_wasis.ui.berita.BeritaFragment;
import pnj.uts.ti.zakirio_hugoraazaq_wasis.ui.home.HomeFragment;
import pnj.uts.ti.zakirio_hugoraazaq_wasis.ui.profil.ProfilFragment;

public class Dashboard extends AppCompatActivity {

private ActivityDashboardBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        replaceFragment(new HomeFragment());

        binding.navView.setOnItemSelectedListener(item -> {

            if (item.getItemId() == R.id.nav_home) {
                replaceFragment(new HomeFragment());
            } else if (item.getItemId() == R.id.nav_berita) {
                replaceFragment(new BeritaFragment());
            } else if (item.getItemId() == R.id.nav_profil) {
                replaceFragment(new ProfilFragment());
            }

            /* switch (item.getItemId()) {
                case 1000039:
                    replaceFragment(new HomeFragment());
                case 1000034:
                    replaceFragment(new BeritaFragment());
                case 1000006:
                    replaceFragment(new ProfilFragment());
            } */

            return true;
        });

        /* BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_berita, R.id.nav_profil)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_dashboard);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController); */
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_container, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.navTambahData) {
            Intent intent = new Intent(Dashboard.this, TambahData.class);
            startActivity(intent);
        }
        if (id == R.id.navDataAlumni) {
            Intent intent = new Intent(Dashboard.this, DataAlumni.class);
            startActivity(intent);
        }
        if (id == R.id.navLogout) {

        }
        return true;
    }
}