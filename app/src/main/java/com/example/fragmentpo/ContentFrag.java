package com.example.fragmentpo;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

public class ContentFrag extends Fragment {
    GridView gridView;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.content_frag, container, false);
        gridView = view.getRootView().findViewById(R.id.gridview);
        gridView.setOnItemClickListener((adapterView, view, i, l) -> {
            String s =adapterView.getItemAtPosition(i).toString();
            Intent intent = new Intent(view.getContext(), com.example.fragmentpo.FullImage.class);
            intent.putExtra("url", s);
            startActivity(intent);
        });
        return view;
    }

    String[] fruit = {
            "https://media.istockphoto.com/photos/colorful-vegetables-and-fruits-vegan-food-in-rainbow-colors-picture-id1284690585?s=612x612",
            "https://media.istockphoto.com/photos/variety-of-fresh-organic-vegetables-and-fruits-in-the-garden-picture-id1280856062?b=1&k=20&m=1280856062&s=170667a&w=0&h=wQu-c2ZjzeCBkAGEj69xpF611lx1i_xim48vOCj_Dw0=",
            "https://media.istockphoto.com/photos/fresh-fruits-and-vegetables-frame-on-white-background-copy-space-picture-id1288664808?b=1&k=20&m=1288664808&s=170667a&w=0&h=Ueb9uaojbZzO-CQwjbkUKrO93Lu4ZeflotWga3Wrq9w=",
            "https://images.unsplash.com/photo-1625168678264-5073f0a36089?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80"
        };
    String[] animal = {
            "https://media.istockphoto.com/photos/brown-really-brings-out-my-eyes-dont-you-think-picture-id1304018836?b=1&k=20&m=1304018836&s=170667a&w=0&h=w3Jy-2GcvaJ1JHHylXJamCDQQByuDVNppXtsFZpZu_M=",
            "https://images.unsplash.com/photo-1555169062-013468b47731?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8YW5pbWFsfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=800&q=60",
            "https://images.unsplash.com/photo-1546182990-dffeafbe841d?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1759&q=80",
            "https://images.unsplash.com/photo-1437622368342-7a3d73a34c8f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1920&q=80",
        };
    String[] food = {
            "https://images.unsplash.com/photo-1555939594-58d7cb561ad1?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=774&q=80",
            "https://images.unsplash.com/photo-1567620905732-2d1ec7ab7445?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=960&q=80",
            "https://images.unsplash.com/photo-1540189549336-e6e99c3679fe?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=774&q=80",
            "https://images.unsplash.com/photo-1512621776951-a57141f2eefd?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1770&q=80",
        };


    public void updateContent(int position){
        switch (position){
            case 0:
                gridView.setAdapter(new com.example.fragmentpo.ImageAdapter(getContext(),fruit));
                break;
            case 1:
                gridView.setAdapter(new com.example.fragmentpo.ImageAdapter(getContext(),animal));
                break;
            case 2:
                gridView.setAdapter(new com.example.fragmentpo.ImageAdapter(getContext(),food));
                break;
        }
    }
    
//    public void reUpdate(String url){
//        if(checkUrl(url,fruit)){
//            gridView.setAdapter(new ImageAdapter(getContext(),fruit));
//        }else if (checkUrl(url, animal)){
//            gridView.setAdapter(new ImageAdapter(getContext(),animal));
//        }else if (checkUrl(url,food)){
//            gridView.setAdapter(new ImageAdapter(getContext(),food));
//        }else{
//            Toast.makeText(getActivity(),"Lỗi Tải Ảnh", Toast.LENGTH_LONG).show();
//        }
//
//    }
//
//    public boolean checkUrl(String url, String[] urls){
//        for (String s : urls) {
//            if (url.equals(s)) {
//                return true;
//            }
//        }
//        return false;
//    }




}
