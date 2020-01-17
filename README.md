# BottomNavigatinBar

<dl>
    <dt>After many attempts of implementing BottomNavigationBar,founded perfectly working Android Library</dt>

######################################################################################################################################
<dt>To implement BottomNavigationBar add this dependencies to app level build.gradle</dt>

<dt>dependencies {
    implementation 'com.github.ittianyu:BottomNavigationViewEx:2.0.4'
    implementation "com.android.support:design:28.0.0"
}</dt>
########################################################################################################################################
Add this dependencies to project level build.gradle

   allprojects {
    repositories {
        google()
        jcenter()
        maven { url "https://jitpack.io" }
    }
}
########################################################################################################################################
Add this xml to main.xml file
</dl>
<com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx
        android:id="@+id/bottom_bar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        android:background="@android:color/white"
        app:itemIconTint="@color/tab_selector"
        app:labelVisibilityMode="unlabeled"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:menu="@menu/menu" />
######################################################################################################################################## 

In Values under color.xml add this lines

<?xml version="1.0" encoding="utf-8"?>
<resources>
    <color name="colorPrimary">#008577</color>
    <color name="colorPrimaryDark">#00574B</color>
    <color name="colorAccent">#D81B60</color>
    <color name="tab_selector">#D85C00</color>
</resources>
########################################################################################################################################
In strings.xml add this lines
<resources>
    <string name="app_name">BottomNavigatinBar</string>
    <string name="home_title">Home</string>
    <string name="messages_title">Message</string>
    <string name="notifications_title">Notification</string>
    <string name="moments_title">Search</string>
</resources>
########################################################################################################################################
Create a menu Resource folder in that create new menu resource file named as menu.xml

<?xml version="1.0" encoding="utf-8"?>
<menu
    xmlns:android="http://schemas.android.com/apk/res/android">
    <item
        android:id="@+id/id_home"
        android:checked="true"
        android:icon="@drawable/ic_home"
        android:title="@string/home_title"/>
    <item
        android:id="@+id/id_search"
        android:icon="@drawable/ic_search"
        android:title="@string/moments_title"/>
    <item
        android:id="@+id/id_notifications"
        android:icon="@drawable/ic_notifications"
        android:title="@string/notifications_title"/>
    <item
        android:id="@+id/id_messages"
        android:icon="@drawable/ic_message"
        android:title="@string/messages_title"/>
</menu>
########################################################################################################################################        
In MainActivity.java file        

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class MainActivity extends AppCompatActivity {
    BottomNavigationViewEx bnve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bnve = (BottomNavigationViewEx) findViewById(R.id.bottom_bar);
        bnve.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.id_home:
                        Toast.makeText(MainActivity.this,"Home Tab",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.id_search:
                        Toast.makeText(MainActivity.this,"Search Tab",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.id_notifications:
                        Toast.makeText(MainActivity.this,"Notifications Tab",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.id_messages:
                        Toast.makeText(MainActivity.this,"Message Tab",Toast.LENGTH_LONG).show();
                        break;
                    default:
                }
                return true;
            }

        });
    }
}
########################################################################################################################################
