package pnj.uts.ti.zakirio_hugoraazaq_wasis.ui.berita;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import pnj.uts.ti.zakirio_hugoraazaq_wasis.databinding.FragmentBeritaBinding;

public class BeritaFragment extends Fragment {

private FragmentBeritaBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        BeritaViewModel beritaViewModel =
                new ViewModelProvider(this).get(BeritaViewModel.class);

    binding = FragmentBeritaBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

        final TextView textView = binding.textDashboard;
        beritaViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}