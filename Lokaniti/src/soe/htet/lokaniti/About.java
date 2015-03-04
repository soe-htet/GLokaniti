package soe.htet.lokaniti;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class About extends Fragment {

	public About() {
		// TODO Auto-generated constructor stub
	}
	
	Button btnFeedback;
	Context c;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.about, container,false);
		
		btnFeedback= (Button) view.findViewById(R.id.btnSendFeedback);
		btnFeedback.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent feedback = new Intent(Intent.ACTION_SEND);
				 String[] TO = {"soehtet1991@gmail.com"};
			     // String[] CC = {"mcmohd@gmail.com"};
			      //Intent emailIntent = new Intent(Intent.ACTION_SEND);
			      feedback.setData(Uri.parse("mailto:"));
			      feedback.setType("message/rfc822");


			      feedback.putExtra(Intent.EXTRA_EMAIL, TO);
			      feedback.putExtra(Intent.EXTRA_SUBJECT, "Feedback LOKANITI");
			      /*emailIntent.putExtra(Intent.EXTRA_CC, CC);
			      emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Your subject");
			      emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message goes here");*/
			    
			      try {
			          startActivity(Intent.createChooser(feedback, "Send mail..."));
			          //finish();
			    	  //startActivity(feedback);
			          Log.i("Finished sending email...", "");
			       } catch (android.content.ActivityNotFoundException ex) {
			          Toast.makeText( getActivity(), 
			          "There is no email client installed.", Toast.LENGTH_SHORT).show();
			       }
			      
			}
		});
		
		
		return view;
	}
	
}
