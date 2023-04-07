# Kotlin_BottomSheet_Dialog


<img width="283" alt="forbottomsheet" src="https://user-images.githubusercontent.com/60017090/230587437-9cbfcb77-7bcd-4673-9886-331ae5a53447.png">


//MainActivity



                        class MainActivity : AppCompatActivity() {
                            lateinit var textView: TextView
                            lateinit var linearLayout1:LinearLayout
                            lateinit var dialog: BottomSheetDialog
                            override fun onCreate(savedInstanceState: Bundle?) {
                                super.onCreate(savedInstanceState)
                                setContentView(R.layout.activity_main)
                                textView=findViewById(R.id.textview1)
                                linearLayout1=findViewById(R.id.linearlay1)

                                //dialog = BottomSheetDialog(this@MainActivity)
                                dialog = BottomSheetDialog(this@MainActivity,R.style.bottomsheettheme)
                               val view1: View = LayoutInflater.from(this@MainActivity).inflate(R.layout.layoutbottomsheet, linearLayout1, null == true)



                                dialog.setContentView(view1)

                                textView.setOnClickListener {
                                    dialog.show()
                                }
                            }
                        }
                        
                        
                        
//layoutbottomsheet


                      <?xml version="1.0" encoding="utf-8"?>
                      <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
                          android:orientation="vertical"
                          android:layout_width="match_parent"
                          android:padding="15dp"
                          android:background="@drawable/backgroundsheet"
                          android:layout_height="wrap_content">
                          <ImageView
                              android:src="@drawable/sniper"
                              android:scaleType="centerCrop"
                              android:layout_width="match_parent"
                              android:layout_height="200dp"></ImageView>

                      </LinearLayout>


//backgroundshape


                      <?xml version="1.0" encoding="utf-8"?>
                      <shape xmlns:android="http://schemas.android.com/apk/res/android"
                          android:shape="rectangle"
                          >
                          <solid android:color="@android:color/white"></solid>

                          <corners
                              android:topRightRadius="35dp"
                              android:topLeftRadius="35dp"></corners>
                      </shape>
                      
                      


//res/values/themes.xml


                    <style name="bottomsheettheme" parent="Theme.MaterialComponents.Light.BottomSheetDialog">
                            <item name="bottomSheetStyle">@style/bottomsheeetstyle</item>
                        </style>
                        <style name="bottomsheeetstyle" parent="Widget.Design.BottomSheet.Modal">
                            <item name="android:background">@android:color/transparent</item>
                        </style>

