package com.example.user.p8runtimefragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

   private Button boton;
    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_first, container, false);
       boton=view.findViewById(R.id.button);
       boton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new SecondFragment(), null).addToBackStack(null).commit();


           }
       });
        // Inflate the layout for this fragment
        return view;
    }

}
