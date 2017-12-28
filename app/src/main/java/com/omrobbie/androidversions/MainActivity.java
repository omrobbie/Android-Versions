package com.omrobbie.androidversions;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvAndroid;
    private List<AndroidPojo> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupEnv();
        setupList();

        loadDataDummy();
    }

    private void setupEnv() {
        rvAndroid = (RecyclerView) findViewById(R.id.rvAndroid);

        list = new ArrayList<>();
    }

    private void setupList() {
        AndroidAdapter adapter = new AndroidAdapter(list);
        rvAndroid.setLayoutManager(new LinearLayoutManager(this));
        rvAndroid.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        rvAndroid.setAdapter(adapter);
    }

    private void loadDataDummy() {
        list.add(new AndroidPojo(
                "(No Codename)",
                "1.0",
                "2008-09-28",
                "",
                "Android 1.0, the first commercial version of the software, was released on September 23, 2008.[33] The first commercially available Android device was the HTC Dream.[34] Android 1.0 incorporated the following features:"
        ));

        list.add(new AndroidPojo(
                "(Internally known as 'Petit Four')",
                "1.1",
                "2009-02-09",
                "",
                "On February 9, 2009, the Android 1.1 update was released, initially for the HTC Dream only. Android 1.1 was known as \"Petit Four\" internally, though this name was not used officially.[2][41] The update resolved bugs, changed the Android API and added a number of features:[42]"
        ));

        list.add(new AndroidPojo(
                "Cupcake",
                "1.5",
                "2009-04-27",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/Android_Cupcake_home_screen.jpg/230px-Android_Cupcake_home_screen.jpg",
                "On April 27, 2009, the Android 1.5 update was released, based on Linux kernel 2.6.27.[43][44] This was the first release to officially use a codename based on a dessert item (\"Cupcake\"), a theme which would be used for all releases henceforth. The update included several new features and UI amendments:[45]"
        ));

        list.add(new AndroidPojo(
                "Donut",
                "1.6",
                "2009-09-15",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/Android_1.6_on_the_Android_SDK.png/230px-Android_1.6_on_the_Android_SDK.png",
                "On September 15, 2009, Android 1.6 – dubbed Donut – was released, based on Linux kernel 2.6.29.[47][48][49] Included in the update were numerous new features:[47]"
        ));

        list.add(new AndroidPojo(
                "Eclair",
                "2.0 - 2.1",
                "2009-10-26",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Android-2.0.png/255px-Android-2.0.png",
                "On October 26, 2009, the Android 2.0 SDK was released, based on Linux kernel 2.6.29 and codenamed Eclair.[50] Changes include the ones listed below.[51]"
        ));

        list.add(new AndroidPojo(
                "Froyo",
                "2.2 - 2.2.3",
                "2010-05-20",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/5/5f/Android_2.2_Froyo_home.png/230px-Android_2.2_Froyo_home.png",
                "On May 20, 2010, the SDK for Android 2.2 (Froyo, short for frozen yogurt) was released, based on Linux kernel 2.6.32.[55]"
        ));

        list.add(new AndroidPojo(
                "Gingerbread",
                "2.3 - 2.3.7",
                "2010-12-06",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Android_screenshot.png/230px-Android_screenshot.png",
                "On December 6, 2010, the Android 2.3 (Gingerbread) SDK was released, based on Linux kernel 2.6.35.[64][65] Changes included:[64]"
        ));

        list.add(new AndroidPojo(
                "Honeycomb",
                "3.0 - 3.2.6",
                "2011-02-22",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Android3.0.png/230px-Android3.0.png",
                "On February 22, 2011, the Android 3.0 (Honeycomb) SDK – the first tablet-only Android update – was released, based on Linux kernel 2.6.36.[78][79][80][81] The first device featuring this version, the Motorola Xoom tablet, was released on February 24, 2011.[82] The update's features included:[78]"
        ));

        list.add(new AndroidPojo(
                "Ice Cream Sandwich",
                "4.0 - 4.0.4",
                "2011-10-18",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/Android_4.0.png/230px-Android_4.0.png",
                "The SDK for Android 4.0.1 (Ice Cream Sandwich), based on Linux kernel 3.0.1,[91] was publicly released on October 19, 2011.[92] Google's Gabe Cohen stated that Android 4.0 was \"theoretically compatible\" with any Android 2.3.x device in production at that time.[93] The source code for Android 4.0 became available on November 14, 2011.[94] Ice Cream Sandwich was the last version to officially support Adobe Systems' Flash player.[95] The update introduced numerous new features:[96][97][98]"
        ));

        list.add(new AndroidPojo(
                "Jelly Bean",
                "4.1 - 4.3.1",
                "2012-07-09",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c4/Android_4.1_on_the_Galaxy_Nexus.jpeg/230px-Android_4.1_on_the_Galaxy_Nexus.jpeg",
                "Google announced Android 4.1 (Jelly Bean) at the Google I/O conference on June 27, 2012. Based on Linux kernel 3.0.31, Jelly Bean was an incremental update with the primary aim of improving the functionality and performance of the user interface. The performance improvement involved \"Project Butter\", which uses touch anticipation, triple buffering, extended vsync timing and a fixed frame rate of 60 fps to create a fluid and \"buttery-smooth\" UI.[108] Android 4.1 Jelly Bean was released to the Android Open Source Project on July 9, 2012,[109] and the Nexus 7 tablet, the first device to run Jelly Bean, was released on July 13, 2012."
        ));

        list.add(new AndroidPojo(
                "KitKat",
                "4.4 - 4.4.4",
                "2013-10-31",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6e/Nexus_5_%28Android_4.4.2%29_Screenshot.jpg/230px-Nexus_5_%28Android_4.4.2%29_Screenshot.jpg",
                "Google announced Android 4.4 KitKat on September 3, 2013. Although initially under the \"Key Lime Pie\" (\"KLP\") codename, the name was changed because \"very few people actually know the taste of a key lime pie.\"[142] Some technology bloggers also expected the \"Key Lime Pie\" release to be Android 5.[143] KitKat debuted on Google's Nexus 5 on October 31, 2013, and was optimized to run on a greater range of devices than earlier Android versions, having 512 MB of RAM as a recommended minimum; those improvements were known as \"Project Svelte\" internally at Google.[144] The required minimum amount of RAM available to Android is 340 MB, and all devices with less than 512 MB of RAM must report themselves as \"low RAM\" devices.[145]"
        ));

        list.add(new AndroidPojo(
                "Lollipop",
                "5.0 - 5.1.1",
                "2014-11-12",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Android_5.0-en.png/230px-Android_5.0-en.png",
                "Android 5.0 \"Lollipop\" was unveiled under the codename \"Android L\" on June 25, 2014, during Google I/O. It became available as official over-the-air (OTA) updates on November 12, 2014, for select devices that run distributions of Android serviced by Google, including Nexus and Google Play edition devices. Its source code was made available on November 3, 2014.[173][174]\n" +
                        "Lollipop features a redesigned user interface built around a responsive design language referred to as \"material design\". Other changes include improvements to the notifications, which can be accessed from the lockscreen and displayed within applications as top-of-the-screen banners. Furthermore, Google made internal changes to the platform, with the Android Runtime (ART) officially replacing Dalvik for improved application performance, and with changes intended to improve and optimize battery usage, known internally as Project Volta.[175][176][177][178]"
        ));

        list.add(new AndroidPojo(
                "Marhmallow",
                "6.0 - 6.0.1",
                "2015-10-05",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Android_6.0-en.png/230px-Android_6.0-en.png",
                "Android 6.0 \"Marshmallow\" was unveiled under the codename \"Android M\" during Google I/O on May 28, 2015, for the Nexus 5 and Nexus 6 phones, Nexus 9 tablet, and Nexus Player set-top box, under the build number MPZ44Q.[203] The third developer preview (MPA44G) was released on August 17, 2015 for the Nexus 5, Nexus 6, Nexus 9 and Nexus Player devices,[204] and was updated to MPA44I that brought fixes related to Android for Work profiles.[205]"
                ));

        list.add(new AndroidPojo(
                "Nougat",
                "7.0 - 7.1.2",
                "2016-08-22",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/Android_7.0-en.png/230px-Android_7.0-en.png",
                "Android \"Nougat\" (codenamed N in-development) is the major 7.0 release of the Android operating system. It was first released as a developer preview on March 9, 2016, with factory images for current Nexus devices, as well as with the new \"Android Beta Program\" which allows supported devices to be upgraded directly to the Android Nougat beta via over-the-air update. Final release was on August 22, 2016. The final preview build was released on July 18, 2016,[223] with the build number NPD90G."
        ));

        list.add(new AndroidPojo(
                "Oreo",
                "8.0 - 8.1",
                "2017-08-21",
                "https://upload.wikimedia.org/wikipedia/en/thumb/1/18/Android_8.0_Oreo_Pixel.png/234px-Android_8.0_Oreo_Pixel.png",
                "Android Oreo is the 8th major release of the Android operating system. It was first released as a developer preview on March 21, 2017, with factory images for current Nexus and Pixel devices. The final developer preview was released on July 24, 2017, with the stable version released in August 2017."
        ));
    }
}
