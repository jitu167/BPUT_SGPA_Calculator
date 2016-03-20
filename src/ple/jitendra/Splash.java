
 
	package ple.jitendra;

import ple.jitendra.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;
import android.os.Build;

public class Splash extends Activity {
	String[] grades;
	String[] points;
	int pos;
	double o=1,e=.9,a=0.8,b=0.7,c=0.6,d=0.5,f=0.4;
	int one=0,two=0,three=0,four=0,five=0,six=0,seven=0,eight=0,nine=0,ten=0,elev=0;
	double temp1=0,temp2=0,temp3=0,temp4=0,temp5=0,temp6=0,temp7=0,temp8=0,temp9=0,temp10=0,temp11=0;
	EditText txt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
	
		getWindow().requestFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
          txt=(EditText)findViewById(R.id.editText1);
          Animation hyperspaceJumpAnimation = AnimationUtils.loadAnimation(this, R.anim.abc_fade_out);
          txt.startAnimation(hyperspaceJumpAnimation);
		Spinner s1=(Spinner)findViewById(R.id.spin1row1);
		Spinner s2=(Spinner)findViewById(R.id.spin2row1);
		Spinner s3=(Spinner)findViewById(R.id.spin1row2);
		Spinner s4=(Spinner)findViewById(R.id.spin2row2);
		Spinner s5=(Spinner)findViewById(R.id.spin1row3);
		Spinner s6=(Spinner)findViewById(R.id.spin2row3);
		Spinner s7=(Spinner)findViewById(R.id.spin1row4);
		Spinner s8=(Spinner)findViewById(R.id.spin2row4);
		Spinner s9=(Spinner)findViewById(R.id.spin1row5);
		Spinner s10=(Spinner)findViewById(R.id.spin2row5);
		Spinner s11=(Spinner)findViewById(R.id.spin1row6);
		Spinner s12=(Spinner)findViewById(R.id.spin2row6);
		Spinner s13=(Spinner)findViewById(R.id.spin1row8);
		Spinner s14=(Spinner)findViewById(R.id.spin2row8);
		Spinner s15=(Spinner)findViewById(R.id.spin1row9);
		Spinner s16=(Spinner)findViewById(R.id.spin2row9);
		Spinner s17=(Spinner)findViewById(R.id.spin1row10);
		Spinner s18=(Spinner)findViewById(R.id.spin2row10);
		Spinner s19=(Spinner)findViewById(R.id.spin1row11);
		Spinner s20=(Spinner)findViewById(R.id.spin2row11);
		Spinner s21=(Spinner)findViewById(R.id.spin1row12);
		Spinner s22=(Spinner)findViewById(R.id.spin2row12);
		grades=getResources().getStringArray(R.array.Grade);
		points=getResources().getStringArray(R.array.Points);
		ArrayAdapter<String> arr=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,grades);
		ArrayAdapter<String> arr1=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,points);
		s1.setAdapter(arr1);
		s2.setAdapter(arr);
		s3.setAdapter(arr1);
		s4.setAdapter(arr);
		s5.setAdapter(arr1);
		s6.setAdapter(arr);
		s7.setAdapter(arr1);
		s8.setAdapter(arr);
		s9.setAdapter(arr1);
		s10.setAdapter(arr);
		s11.setAdapter(arr1);
		s12.setAdapter(arr);
		s13.setAdapter(arr1);
		s14.setAdapter(arr);
		s15.setAdapter(arr1);
		s16.setAdapter(arr);
		s17.setAdapter(arr1);
		s18.setAdapter(arr);
		s19.setAdapter(arr1);
		s20.setAdapter(arr);
		s21.setAdapter(arr1);
		s22.setAdapter(arr);
		txt.setEnabled(false);
		//points
		s1.setOnItemSelectedListener(new OnItemSelectedListener()
		{

			@Override
			public void onItemSelected(AdapterView<?> adapt, View view, int position,
					long id) {
				int pos=adapt.getSelectedItemPosition();
				if(points[pos].compareTo("SELECT")!=0)
				{
				
				one=Integer.parseInt(points[pos]);
				}	
			
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				
			}
			
		});
		s2.setOnItemSelectedListener(new OnItemSelectedListener()
		{

			@Override
			public void onItemSelected(AdapterView<?> adapt, View view, int position,
					long id) {
				int pos=adapt.getSelectedItemPosition();
				temp1=grading(pos);
				
			}
			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			
			}
			
		});
		//points
		s3.setOnItemSelectedListener(new OnItemSelectedListener()
		{

			@Override
			public void onItemSelected(AdapterView<?> adapt, View view, int position,
					long id) {
				int pos=adapt.getSelectedItemPosition();
				if(points[pos].compareTo("SELECT")!=0)
				{
				two=Integer.parseInt(points[pos]);
				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			
				
			}
			
		});
		s4.setOnItemSelectedListener(new OnItemSelectedListener()
		{

			@Override
			public void onItemSelected(AdapterView<?> adapt, View view, int position,
					long id) {
				int pos=adapt.getSelectedItemPosition();
				temp2=grading(pos);
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			
				}
			
		});
		//points
		s5.setOnItemSelectedListener(new OnItemSelectedListener()
		{
			public void onItemSelected(AdapterView<?> adapt, View view, int position,
					long id) {
				int pos=adapt.getSelectedItemPosition();
				if(points[pos].compareTo("SELECT")!=0)
				{
				three=Integer.parseInt(points[pos]);
			}
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			
				
			}
			
		});
		s6.setOnItemSelectedListener(new OnItemSelectedListener()
		{

			@Override
			public void onItemSelected(AdapterView<?> adapt, View view, int position,
					long id) {
				int pos=adapt.getSelectedItemPosition();
				temp3=grading(pos);
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			
				}
			
		});
		//points
		s7.setOnItemSelectedListener(new OnItemSelectedListener()
		{

			@Override
			public void onItemSelected(AdapterView<?> adapt, View view, int position,
					long id) {
				
				int pos=adapt.getSelectedItemPosition();
				if(points[pos].compareTo("SELECT")!=0)
				{
				four=Integer.parseInt(points[pos]);
				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
							
			}
			
		});
		s8.setOnItemSelectedListener(new OnItemSelectedListener()
		{

			@Override
			public void onItemSelected(AdapterView<?> adapt, View view, int position,
					long id) {
				int pos=adapt.getSelectedItemPosition();
				temp4=grading(pos);
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				
			}
			
		});
		//points
		s9.setOnItemSelectedListener(new OnItemSelectedListener()
		{

			@Override
			public void onItemSelected(AdapterView<?> adapt, View view, int position,
					long id) {
			
				int pos=adapt.getSelectedItemPosition();
				if(points[pos].compareTo("SELECT")!=0)
				{
				five=Integer.parseInt(points[pos]);
			}
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			  
				
			}
			
		});
		s10.setOnItemSelectedListener(new OnItemSelectedListener()
		{

			@Override
			public void onItemSelected(AdapterView<?> adapt, View view, int position,
					long id) {
				int pos=adapt.getSelectedItemPosition();
				
				temp5=grading(pos);
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				
			}
			
		});
		//points
		s11.setOnItemSelectedListener(new OnItemSelectedListener()
		{

			@Override
			public void onItemSelected(AdapterView<?> adapt, View view, int position,
					long id) {
				
				int pos=adapt.getSelectedItemPosition();
				if(points[pos].compareTo("SELECT")!=0)
				{
				six=Integer.parseInt(points[pos]);
			}
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
		
				
			}
			
		});
		s12.setOnItemSelectedListener(new OnItemSelectedListener()
		{

			@Override
			public void onItemSelected(AdapterView<?> adapt, View view, int position,
					long id) {
				
				int pos=adapt.getSelectedItemPosition();
		
				temp6=grading(pos);
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				}
			
		});
		//points
		s13.setOnItemSelectedListener(new OnItemSelectedListener()
		{

			@Override
			public void onItemSelected(AdapterView<?> adapt, View view, int position,
					long id) {
				
				
				int pos=adapt.getSelectedItemPosition();
				if(points[pos].compareTo("SELECT")!=0)
				{
				seven=Integer.parseInt(points[pos]);
			}
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
	
			}
			
		});
		s14.setOnItemSelectedListener(new OnItemSelectedListener()
		{

			@Override
			public void onItemSelected(AdapterView<?> adapt, View view, int position,
					long id) {
				
				int pos=adapt.getSelectedItemPosition();
				
				temp7=grading(pos);
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				
			}
			
		});
		//points
		s15.setOnItemSelectedListener(new OnItemSelectedListener()
		{

			@Override
			public void onItemSelected(AdapterView<?> adapt, View view, int position,
					long id) {
				
				int pos=adapt.getSelectedItemPosition();
				if(points[pos].compareTo("SELECT")!=0)
				{
				eight=Integer.parseInt(points[pos]);
				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			
				
			}
			
		});
		s16.setOnItemSelectedListener(new OnItemSelectedListener()
		{

			@Override
			public void onItemSelected(AdapterView<?> adapt, View view, int position,
					long id) {
				int pos=adapt.getSelectedItemPosition();
				
				temp8=grading(pos);
				
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				
			}
			
		});
		//points
		s17.setOnItemSelectedListener(new OnItemSelectedListener()
		{

			@Override
			public void onItemSelected(AdapterView<?> adapt, View view, int position,
					long id) {
				int pos=adapt.getSelectedItemPosition();
				if(points[pos].compareTo("SELECT")!=0)
				{
				nine=Integer.parseInt(points[pos]);
				}
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			
				
			}
			
		});

		s18.setOnItemSelectedListener(new OnItemSelectedListener()
		{

			@Override
			public void onItemSelected(AdapterView<?> adapt, View view, int position,
					long id) {
				int pos=adapt.getSelectedItemPosition();
				temp9=grading(pos);
				
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			
			}
			
		});
		s19.setOnItemSelectedListener(new OnItemSelectedListener()
		{

			@Override
			public void onItemSelected(AdapterView<?> adapt, View view, int position,
					long id) {
				int pos=adapt.getSelectedItemPosition();
				if(points[pos].compareTo("SELECT")!=0)
				{
				ten=Integer.parseInt(points[pos]);
				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			
			}
			
		});
		s20.setOnItemSelectedListener(new OnItemSelectedListener()
		{

			@Override
			public void onItemSelected(AdapterView<?> adapt, View view, int position,
					long id) {
				int pos=adapt.getSelectedItemPosition();
				temp10=grading(pos);
				
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			
			}
			
		});
		s21.setOnItemSelectedListener(new OnItemSelectedListener()
		{

			@Override
			public void onItemSelected(AdapterView<?> adapt, View view, int position,
					long id) {
				int pos=adapt.getSelectedItemPosition();
				if(points[pos].compareTo("SELECT")!=0)
				{
				elev=Integer.parseInt(points[pos]);		
				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			
			}
			
		});
		s22.setOnItemSelectedListener(new OnItemSelectedListener()
		{

			@Override
			public void onItemSelected(AdapterView<?> adapt, View view, int position,
					long id) {
				int pos=adapt.getSelectedItemPosition();
				temp11=grading(pos);
				
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			
			}
			
		});
	}
		public double grading(int pos)
		{
			
			   String s=grades[pos];
			if(s.compareToIgnoreCase("o")==0)
			{
			    o=1;
		    }
			else	if(s.compareToIgnoreCase("e")==0)
			{
			    o=0.9;
		    }
			else	if(s.compareToIgnoreCase("a")==0)
			{
			    o=0.8;
		    }
			else	if(s.compareToIgnoreCase("b")==0)
			{
			    o=0.7;
		    }
			else if(s.compareToIgnoreCase("c")==0)
			{
			    o=0.6;
		    }
			else if(s.compareToIgnoreCase("d")==0)
			{
			    o=0.5;
		    }
			else if(s.compareToIgnoreCase("f")==0)
			{
			    o=0.2;
		    }
			else
			{
				o=0;
			}
			return o;
	}
		public void onClick(View view)
		{
			int temp=one+two+three+four+five+six+seven+eight+nine+ten+elev;
			double temp_points=temp1*one+two*temp2+three*temp3+four*temp4+temp5*five+six*temp6+temp7*seven+temp8*eight+nine*temp9+ten*temp10+elev*temp11;
			double tempsgpa=10*temp_points/temp;
			String s=String.valueOf(tempsgpa);
	        txt.setText(s);                      
		}


		
	}
