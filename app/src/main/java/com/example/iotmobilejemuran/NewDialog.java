package com.example.iotmobilejemuran;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Toast;

public class NewDialog extends DialogFragment {
    int[] id;
    String[] name;
    EditText namaInput;
    EditText idInput;
    NoticeDialogListener listener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        listener = (NoticeDialogListener) context;
    }
    public interface NoticeDialogListener {
        public void onDialogPositiveClick(DialogFragment fragment, Jemuran jemur);
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return super.onCreateDialog(savedInstanceState);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dialoglayout, null);
        builder.setView(view);

        id = getResources().getIntArray(R.array.id);
        idInput = view.findViewById(R.id.id);
        namaInput= view.findViewById(R.id.nama);
        name = getResources().getStringArray(R.array.name);


        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, name);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        builder.setPositiveButton("Save", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String namaInsert = namaInput.getText().toString();
                if (TextUtils.isEmpty(namaInsert)) {
                    namaInsert = name[currentIndex];
                }
                int idInsert = Integer.parseInt(idInput.getText().toString());
                Jemuran jemur = new Jemuran(idInsert,namaInsert);

                listener.onDialogPositiveClick(NewDialog.this, jemur);

//                Toast.makeText(getActivity(), lights.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), name[currentIndex], Toast.LENGTH_SHORT).show();
            }
        });



//        builder.setTitle("new Dialog");
//        builder.setMessage("Hello Dialog");

        return builder.create();

    }
}
