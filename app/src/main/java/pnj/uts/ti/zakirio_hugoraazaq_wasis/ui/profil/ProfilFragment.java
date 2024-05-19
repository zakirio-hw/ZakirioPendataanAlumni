package pnj.uts.ti.zakirio_hugoraazaq_wasis.ui.profil;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import pnj.uts.ti.zakirio_hugoraazaq_wasis.R;
import pnj.uts.ti.zakirio_hugoraazaq_wasis.databinding.FragmentProfilBinding;

public class ProfilFragment extends Fragment {

    View v;

    private EditText txtNama, txtNIM, txtEmail, txtKelas;

private FragmentProfilBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        /* ProfilViewModel profilViewModel =
                new ViewModelProvider(this).get(ProfilViewModel.class);

    binding = FragmentProfilBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

        final TextView textView = binding.textNotifications;
        profilViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root; */

        v = inflater.inflate(R.layout.fragment_profil, container, false);
        txtNama = v.findViewById(R.id.txtNama);
        txtNIM = v.findViewById(R.id.txtNIM);
        txtEmail = v.findViewById(R.id.txtEmail);
        txtKelas = v.findViewById(R.id.txtKelas);
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("SharedPref_Profile", Context.MODE_PRIVATE);
        String nama = sharedPreferences.getString("nama", "");
        String nim = sharedPreferences.getString("NIM", "");
        String email = sharedPreferences.getString("email", "");
        String kelas = sharedPreferences.getString("kelas", "");

        txtNama.setText(nama);
        txtNIM.setText(nim);
        txtEmail.setText(email);
        txtKelas.setText(kelas);

        return v;
    }

/* @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    } */
}