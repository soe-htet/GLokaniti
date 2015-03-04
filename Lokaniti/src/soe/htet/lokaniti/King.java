package soe.htet.lokaniti;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

public class King extends Fragment {
	
	ImageButton btn_left,btn_right,btn_mm,btn_uk;
	TextView sage_txt;
	TextView title;
	 int cur=0;
	 String title_string="1/27";
	 static int curText = 0;
	 String[] mm_num,part2_mm,part2_en,part2_mm_exp,part2_en_exp;
	 Resources resources;
	
	public King(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		resources = getResources();
		mm_num = resources.getStringArray(R.array.mm_number);
		part2_mm = resources.getStringArray(R.array.part6_mm);
		part2_en = resources.getStringArray(R.array.part6_en);
		part2_mm_exp = resources.getStringArray(R.array.part6_mm_exp);
		part2_en_exp = resources.getStringArray(R.array.part6_en_exp);
 
        View rootView = inflater.inflate(R.layout.king, container, false);
        
        title_string = mm_num[0]+"/"+mm_num[25];
        title = (TextView) rootView.findViewById(R.id.title);
        title.setText(title_string);
        btn_mm = (ImageButton) rootView.findViewById(R.id.btn_king_mm);
        btn_uk = (ImageButton) rootView.findViewById(R.id.btn_king_uk);
        btn_left = (ImageButton) rootView.findViewById(R.id.btn_king_left);
        btn_right = (ImageButton) rootView.findViewById(R.id.btn_king_right);
        sage_txt = (TextView) rootView.findViewById(R.id.king_textView);
        sage_txt.setText(part2_mm[cur]+"\n\n\n\n*** "+getResources().getString(R.string.shinchat)+" ***\n"+part2_mm_exp[cur]);
        
        btn_mm.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				curText = 0;
				title_string =mm_num[cur]+"/"+mm_num[25];
				title.setText(title_string);
				sage_txt.setText(part2_mm[cur]+"\n\n\n\n*** "+resources.getString(R.string.shinchat)+" ***\n"+part2_mm_exp[cur]);
			}
		}); 
        
        btn_uk.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				curText = 1;
				int tmp = cur+1;
				title_string  = tmp+"/26";
				title.setText(title_string);
				sage_txt.setText(part2_en[cur]+"\n\n\n\n*** Explanation ***\n"+part2_en_exp[cur]);
			}
		});
        
        btn_left.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(cur!=0)
				{
					cur--;
					if(curText == 0)
					{
						title_string =mm_num[cur]+"/"+mm_num[25];
						title.setText(title_string);
						sage_txt.setText(part2_mm[cur]+"\n\n\n\n*** "+resources.getString(R.string.shinchat)+" ***\n"+part2_mm_exp[cur]);
					}
					else
					{
						int tmp = cur+1;
						title_string =tmp+"/26";
						title.setText(title_string);
						sage_txt.setText(part2_en[cur]+"\n\n\n\n*** Explanatin ***\n"+part2_en_exp[cur]);
					}
				}
			}
		});
        btn_right.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(cur !=25)
				{
					cur ++;
					if(curText == 0)
					{
						title_string =mm_num[cur]+"/"+mm_num[25];
						title.setText(title_string);
						sage_txt.setText(part2_mm[cur]+"\n\n\n\n*** "+resources.getString(R.string.shinchat)+" ***\n"+part2_mm_exp[cur]);
					}
					else
					{
						int tmp = cur+1;
						title_string =tmp+"/26";
						title.setText(title_string);
						sage_txt.setText(part2_en[cur]+"\n\n\n\n*** Explanation ***\n"+part2_en_exp[cur]);
					}
				}
					
			}
		});
        
        
        return rootView;
    }
}
