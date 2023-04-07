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
