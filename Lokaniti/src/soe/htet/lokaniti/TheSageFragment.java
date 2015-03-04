package soe.htet.lokaniti;


import java.util.ArrayList;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class TheSageFragment extends Fragment {
	ImageButton btn_left,btn_right,btn_mm,btn_uk;
	TextView sage_txt;
	TextView title;
	 int cur=0;
	 String title_string="1/38";
	 static int curText = 0; //0 for Myanmar, 1 for Engish;
	
	
	ArrayList<Integer> mm_list=new ArrayList<Integer>();
	ArrayList<Integer> en_list=new ArrayList<Integer>();
	ArrayList<Integer> mm_list_exp= new ArrayList<Integer>();
	ArrayList<Integer> en_list_exp = new ArrayList<Integer>();
	String[] mm_num;
	Resources myResources ;
	
	public TheSageFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
		myResources = getResources();
		mm_num = getResources().getStringArray(R.array.mm_number);
		
		mm_list.add(R.string.part1_mm_1);
		mm_list.add(R.string.part1_mm_2);
		mm_list.add(R.string.part1_mm_3);
		mm_list.add(R.string.part1_mm_4);
		mm_list.add(R.string.part1_mm_5);
		mm_list.add(R.string.part1_mm_6);
		mm_list.add(R.string.part1_mm_7);
		mm_list.add(R.string.part1_mm_8);
		mm_list.add(R.string.part1_mm_9);
		mm_list.add(R.string.part1_mm_10);
		mm_list.add(R.string.part1_mm_11);
		mm_list.add(R.string.part1_mm_12);
		mm_list.add(R.string.part1_mm_13);
		mm_list.add(R.string.part1_mm_14);
		mm_list.add(R.string.part1_mm_15);
		mm_list.add(R.string.part1_mm_16);
		mm_list.add(R.string.part1_mm_17);
		mm_list.add(R.string.part1_mm_18);
		mm_list.add(R.string.part1_mm_19);
		mm_list.add(R.string.part1_mm_20);
		mm_list.add(R.string.part1_mm_21);
		mm_list.add(R.string.part1_mm_22);
		mm_list.add(R.string.part1_mm_23);
		mm_list.add(R.string.part1_mm_24);
		mm_list.add(R.string.part1_mm_25);
		mm_list.add(R.string.part1_mm_26);
		mm_list.add(R.string.part1_mm_27);
		mm_list.add(R.string.part1_mm_28);
		mm_list.add(R.string.part1_mm_29);
		mm_list.add(R.string.part1_mm_30);
		mm_list.add(R.string.part1_mm_31);
		mm_list.add(R.string.part1_mm_32);
		mm_list.add(R.string.part1_mm_33);
		mm_list.add(R.string.part1_mm_34);
		mm_list.add(R.string.part1_mm_35);
		mm_list.add(R.string.part1_mm_36);
		mm_list.add(R.string.part1_mm_37);
		mm_list.add(R.string.part1_mm_38);
		
		
		
		mm_list_exp.add(R.string.part1_mm_exp_1);
		mm_list_exp.add(R.string.part1_mm_exp_2);
		mm_list_exp.add(R.string.part1_mm_exp_3);
		mm_list_exp.add(R.string.part1_mm_exp_4);
		mm_list_exp.add(R.string.part1_mm_exp_5);
		mm_list_exp.add(R.string.part1_mm_exp_6);
		mm_list_exp.add(R.string.part1_mm_exp_7);
		mm_list_exp.add(R.string.part1_mm_exp_8);
		mm_list_exp.add(R.string.part1_mm_exp_9);
		mm_list_exp.add(R.string.part1_mm_exp_10);
		mm_list_exp.add(R.string.part1_mm_exp_11);
		mm_list_exp.add(R.string.part1_mm_exp_12);
		mm_list_exp.add(R.string.part1_mm_exp_13);
		mm_list_exp.add(R.string.part1_mm_exp_14);
		mm_list_exp.add(R.string.part1_mm_exp_15);
		mm_list_exp.add(R.string.part1_mm_exp_16);
		mm_list_exp.add(R.string.part1_mm_exp_17);
		mm_list_exp.add(R.string.part1_mm_exp_18);
		mm_list_exp.add(R.string.part1_mm_exp_19);
		mm_list_exp.add(R.string.part1_mm_exp_20);
		mm_list_exp.add(R.string.part1_mm_exp_21);
		mm_list_exp.add(R.string.part1_mm_exp_22);
		mm_list_exp.add(R.string.part1_mm_exp_23);
		mm_list_exp.add(R.string.part1_mm_exp_24);
		mm_list_exp.add(R.string.part1_mm_exp_25);
		mm_list_exp.add(R.string.part1_mm_exp_26);
		mm_list_exp.add(R.string.part1_mm_exp_27);
		mm_list_exp.add(R.string.part1_mm_exp_28);
		mm_list_exp.add(R.string.part1_mm_exp_29);
		mm_list_exp.add(R.string.part1_mm_exp_30);
		mm_list_exp.add(R.string.part1_mm_exp_31);
		mm_list_exp.add(R.string.part1_mm_exp_32);
		mm_list_exp.add(R.string.part1_mm_exp_33);
		mm_list_exp.add(R.string.part1_mm_exp_34);
		mm_list_exp.add(R.string.part1_mm_exp_35);
		mm_list_exp.add(R.string.part1_mm_exp_36);
		mm_list_exp.add(R.string.part1_mm_exp_37);
		mm_list_exp.add(R.string.part1_mm_exp_38);
		
		
		en_list.add(R.string.part1_en_1);
		en_list.add(R.string.part1_en_2);
		en_list.add(R.string.part1_en_3);
		en_list.add(R.string.part1_en_4);
		en_list.add(R.string.part1_en_5);
		en_list.add(R.string.part1_en_6);
		en_list.add(R.string.part1_en_7);
		en_list.add(R.string.part1_en_8);
		en_list.add(R.string.part1_en_9);
		en_list.add(R.string.part1_en_10);
		en_list.add(R.string.part1_en_11);
		en_list.add(R.string.part1_en_12);
		en_list.add(R.string.part1_en_13);
		en_list.add(R.string.part1_en_14);
		en_list.add(R.string.part1_en_15);
		en_list.add(R.string.part1_en_16);
		en_list.add(R.string.part1_en_17);
		en_list.add(R.string.part1_en_18);
		en_list.add(R.string.part1_en_19);
		en_list.add(R.string.part1_en_20);
		en_list.add(R.string.part1_en_21);
		en_list.add(R.string.part1_en_22);
		en_list.add(R.string.part1_en_23);
		en_list.add(R.string.part1_en_24);
		en_list.add(R.string.part1_en_25);
		en_list.add(R.string.part1_en_26);
		en_list.add(R.string.part1_en_27);
		en_list.add(R.string.part1_en_28);
		en_list.add(R.string.part1_en_29);
		en_list.add(R.string.part1_en_30);
		en_list.add(R.string.part1_en_31);
		en_list.add(R.string.part1_en_32);
		en_list.add(R.string.part1_en_33);
		en_list.add(R.string.part1_en_34);
		en_list.add(R.string.part1_en_35);
		en_list.add(R.string.part1_en_36);
		en_list.add(R.string.part1_en_37);
		en_list.add(R.string.part1_en_38);
		
		
		en_list_exp.add(R.string.part1_en_exp_1);
		en_list_exp.add(R.string.part1_en_exp_2);
		en_list_exp.add(R.string.part1_en_exp_3);
		en_list_exp.add(R.string.part1_en_exp_4);
		en_list_exp.add(R.string.part1_en_exp_5);
		en_list_exp.add(R.string.part1_en_exp_6);
		en_list_exp.add(R.string.part1_en_exp_7);
		en_list_exp.add(R.string.part1_en_exp_8);
		en_list_exp.add(R.string.part1_en_exp_9);
		en_list_exp.add(R.string.part1_en_exp_10);
		en_list_exp.add(R.string.part1_en_exp_11);
		en_list_exp.add(R.string.part1_en_exp_12);
		en_list_exp.add(R.string.part1_en_exp_13);
		en_list_exp.add(R.string.part1_en_exp_14);
		en_list_exp.add(R.string.part1_en_exp_15);
		en_list_exp.add(R.string.part1_en_exp_16);
		en_list_exp.add(R.string.part1_en_exp_17);
		en_list_exp.add(R.string.part1_en_exp_18);
		en_list_exp.add(R.string.part1_en_exp_19);
		en_list_exp.add(R.string.part1_en_exp_20);
		en_list_exp.add(R.string.part1_en_exp_21);
		en_list_exp.add(R.string.part1_en_exp_22);
		en_list_exp.add(R.string.part1_en_exp_23);
		en_list_exp.add(R.string.part1_en_exp_24);
		en_list_exp.add(R.string.part1_en_exp_25);
		en_list_exp.add(R.string.part1_en_exp_26);
		en_list_exp.add(R.string.part1_en_exp_27);
		en_list_exp.add(R.string.part1_en_exp_28);
		en_list_exp.add(R.string.part1_en_exp_29);
		en_list_exp.add(R.string.part1_en_exp_30);
		en_list_exp.add(R.string.part1_en_exp_31);
		en_list_exp.add(R.string.part1_en_exp_32);
		en_list_exp.add(R.string.part1_en_exp_33);
		en_list_exp.add(R.string.part1_en_exp_34);
		en_list_exp.add(R.string.part1_en_exp_35);
		en_list_exp.add(R.string.part1_en_exp_36);
		en_list_exp.add(R.string.part1_en_exp_37);
		en_list_exp.add(R.string.part1_en_exp_38);
		
		
		
		
		title_string = mm_num[0]+"/"+mm_num[37];
		
        View rootView = inflater.inflate(R.layout.sage, container, false);
        title = (TextView) rootView.findViewById(R.id.title);
        title.setText(title_string);
        btn_mm = (ImageButton) rootView.findViewById(R.id.btn_sage_mm);
        btn_uk = (ImageButton) rootView.findViewById(R.id.btn_sage_uk);
        btn_left = (ImageButton) rootView.findViewById(R.id.btn_sage_left);
        btn_right = (ImageButton) rootView.findViewById(R.id.btn_sage_right);
        sage_txt = (TextView) rootView.findViewById(R.id.sage_textView);
        sage_txt.setText(getResources().getString(mm_list.get(cur))+"\n\n\n\n*** "+getResources().getString(R.string.shinchat)+" ***\n"+getResources().getString(mm_list.get(cur)));
        
        btn_left.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(cur!=0)
				{
					cur--;
					
					if(curText==0)
					{
						title.setText(title_string);
						sage_txt.setText(getResources().getString(mm_list.get(cur))+"\n\n\n\n*** "+myResources.getString(R.string.shinchat)+" ***\n"+myResources.getString(mm_list_exp.get(cur)));
					}
					else
					{
						int tmp = cur+1;
						title_string =tmp+"/38";
						title.setText(title_string);
						sage_txt.setText(myResources.getString(en_list.get(cur))+"\n\n\n\n*** Explanation ***\n"+myResources.getString(en_list_exp.get(cur)));
					}
					
				}
			}
		});
        btn_right.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(cur !=mm_list.size()-1)
				{
					cur++;
					if(curText==0)
					{
						title_string =mm_num[cur]+"/"+mm_num[37];
						title.setText(title_string);
						sage_txt.setText(getResources().getString(mm_list.get(cur))+"\n\n\n\n*** "+myResources.getString(R.string.shinchat)+" ***\n"+myResources.getString(mm_list_exp.get(cur)));
					}
					else
					{
						int tmp = cur+1;
						title_string =tmp+"/38";
						title.setText(title_string);
						sage_txt.setText(myResources.getString(en_list.get(cur))+"\n\n\n\n*** Explanation ***\n"+myResources.getString(en_list_exp.get(cur)));
					}
				}
			}
		});
        
        
        
        
        btn_mm.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				curText = 0;
				title_string =mm_num[cur]+"/"+mm_num[37];
				title.setText(title_string);
				sage_txt.setText(getResources().getString(mm_list.get(cur))+"\n\n\n\n*** "+myResources.getString(R.string.shinchat)+" ***\n"+myResources.getString(mm_list_exp.get(cur)));
			}
		});
        
        btn_uk.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				curText = 1;
				int tmp = cur+1;
				title_string =tmp+"/38";
				title.setText(title_string);
				sage_txt.setText(myResources.getString(en_list.get(cur))+"\n\n\n\n*** Explanation ***\n"+myResources.getString(en_list_exp.get(cur)));
			}
		});
        
         
        return rootView;
    }
}
