# 第14章 使用Kotlin 进行 Android 开发



![Kotlin Android](http://upload-images.jianshu.io/upload_images/1233356-0a208f489a676e2a.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

根据Realm Report (2017-Q4，https://realm.io/realm-report/2017-q4
) ,过去的一年在Android 端的开发：Java 从 95% 降低到 Java 85%， 而 Kotlin 从 5% 涨到 15% ，如下图所示

![Kotlin is about to change the whole Android ecosystem](http://upload-images.jianshu.io/upload_images/1233356-c1ed83c208150e2f.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

从这个趋势来看，加上最新 Android Studio 3.0的发布（内置 Kotlin 开发 Android 项目的支持），Kotlin 将会很快颠覆 Java 在 Android 领域的地位。

本章将带领大家快速入门使用 Kotlin 进行 Android 应用程序的开发。
 
## 14.1 快速开始 Hello World

我们从一个简单的 Kotlin 版本的Hello World Android 应用程序开始。

###  14.1.1 准备工作

首先准备好开发工具。Android 开发还是用 Google 官方支持的 IDE Android Studio 好。

###  Android Studio 3.0 简介

Google 在 2017-10-26 发布了 Android 8.1 Oreo 开发者预览版的同时还正式发布了 Android Studio 3.0 ，为其 IDE 引入了一系列新功能。

Android Studio 3.0 专注于加速 Android 应用开发，包含大量更新内容，其中最主要的功能之一就包括对 Kotlin 的支持。正如谷歌在 Google I / O 2017.5 所宣布的那样，Kotlin 已被官方支持用于 Android 开发。 Android Studio 3.0是第一个支持 Kotlin 语言的里程碑式版本（在此之前，可以使用Android Studio 的 Kotlin 插件的方式）。

在该版本中提供了许多方便实用的功能如代码自动补全和语法高亮显示，另外，Android Studio 内置转换工具可以非常方便地把 Java 代码转换成 Kotlin 代码，如下图所示


![原始的Java 代码](http://upload-images.jianshu.io/upload_images/1233356-e65b49697b184bb4.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

![Java 转 Kotlin 工具](http://upload-images.jianshu.io/upload_images/1233356-21b6369392094058.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

![转换之后的 Kotlin 代码](http://upload-images.jianshu.io/upload_images/1233356-98d46dad43c5b309.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


#### 安装 Android Studio 3.0

Android Studio 是 Android 的官方 IDE。Android Studio 3.0的一个亮点就是内置了 Kotlin 的支持（https://developer.android.google.cn/kotlin/index.html）。正如 Google I/O 2017 所说的那样, Kotlin 已成为 Android 官方开发语言。

使用 Android Studio 3.0， 我们可以方便地把Java 源代码自动转换成 Kotlin 代码，也可以直接创建  Kotlin 语言开发的 Android 项目, 只需要在新建项目的时候勾选 Include Kotlin support  即可。

首先去官网下载安装：https://developer.android.google.cn/studio/install.html 。笔者当前下载的安装包版本是 android-studio-ide-171.4408382-mac.dmg ，下载完毕点击 dmg 文件


![安装 android studio ide](http://upload-images.jianshu.io/upload_images/1233356-901c2f3cb030c832.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


拷贝至应用程序即可。


### 14.1.2 创建基于 Kotlin 的Android 项目

首先新建项目。如果您未打开项目，请在 Welcome to Android Studio 窗口中点击 Start a new Android Studio project


![Welcome to Android Studio 窗口](http://upload-images.jianshu.io/upload_images/1233356-305404dd1c5addb2.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



如果您已打开项目，请依次点击 File > New > New Project ，如下图所示

![新建项目](http://upload-images.jianshu.io/upload_images/1233356-5fcb5680588666e8.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


进入 Create Android Project 对话框。在创建 Android 项目对话框中配置应用基本信息，注意勾选 Kotlin 支持选项，点击 Next。如下图所示

![创建基于 Kotlin 的Android 项目](http://upload-images.jianshu.io/upload_images/1233356-b9f78ad4867c5512.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

进入 Target Android Devices 配置应用运行 SDK 以及环境信息

![Target Android Devices](http://upload-images.jianshu.io/upload_images/1233356-5557b0743227ce62.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

我们勾选 Phone and Tablet 选项，API 15：Android 4.0.3 ，点击 Next 进入添加 Activity 界面

![添加 Activity 界面](http://upload-images.jianshu.io/upload_images/1233356-0d666c87138a60ac.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


我们选择 Empty Activity，点击 Next，进入配置 Activity 界面

![配置 Activity 界面](http://upload-images.jianshu.io/upload_images/1233356-c9366551f98b79ed.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

配置好 Activity Name与 Layout Name 之后，点击 Finish。我们将得到一个  Kotlin 版本的Hello World Android 应用程序。工程目录如下


![工程目录](http://upload-images.jianshu.io/upload_images/1233356-bbf068714e811c6c.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


### 14.1.3  工程目录文件说明

其中，在顶层的 Gradle 配置文件 build.gradle 中添加了 kotlin-gradle-plugin 插件的依赖
```groovy
buildscript {
    ext.kotlin_version = '1.1.51'
    ...
    dependencies {
        classpath 'com.android.tools.build:gradle:3.0.0'
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
}
...
```
app 目录下的build.gradle 配置文件内容如下

```groovy
apply plugin: 'com.android.application'
apply plugin: 'kotlin-android'
apply plugin: 'kotlin-android-extensions'

dependencies {
    ...
    implementation"org.jetbrains.kotlin:kotlin-stdlib-jre7:$kotlin_version"
    ...
}
```
其中的apply plugin: 'kotlin-android-extensions' 表示使用 Kotlin Android Extensions插件。这个插件是 Kotlin 专门针对 Android 扩展的插件，实现了与 Data-Binding、 Dagger等框架的功能。

布局文件activity_main.xml内容如下

```xml
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.easy.kotlin.myapplication.MainActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</android.support.constraint.ConstraintLayout>

```

MainActivity.kt 代码如下

```kotlin
package com.easy.kotlin.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

```

AndroidManifest.xml 文件内容如下
```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.easy.kotlin.myapplication">

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">
        <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>

```


### 14.1.4  安装运行


点击功能菜单栏中的运行按钮

![运行](http://upload-images.jianshu.io/upload_images/1233356-fb43c3d2537d8494.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

会提示我们选择应用程序部署运行的目标设备

![螢幕快照 2017-10-28 23.58.37.png](http://upload-images.jianshu.io/upload_images/1233356-4ddf420573516738.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

需要注意的是，手机要打开连接 USB 调试模式。点击 OK，Android Studio 会为我们完成打包、安装等事项。最终的运行效果如下


![HelloWord.png](http://upload-images.jianshu.io/upload_images/1233356-540277fe1e0d724e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


##  14.2  综合项目实战：开发一个电影指南应用程序

本节我们将开发一个Android 应用程序, 列出流行/最高评级的电影, 显示预告片和评论。


### 14.2.1  创建 Kotlin Android 项目 

![螢幕快照 2017-10-29 20.07.55.png](http://upload-images.jianshu.io/upload_images/1233356-8548ed7fdb8e52f7.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

![螢幕快照 2017-10-29 20.08.09.png](http://upload-images.jianshu.io/upload_images/1233356-a3312c4582dd21a6.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

![螢幕快照 2017-10-29 20.09.04.png](http://upload-images.jianshu.io/upload_images/1233356-267d9cc20a4de275.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

![螢幕快照 2017-10-29 20.10.21.png](http://upload-images.jianshu.io/upload_images/1233356-21dfed11dd081125.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

![螢幕快照 2017-10-29 20.12.46.png](http://upload-images.jianshu.io/upload_images/1233356-1d110a8e1e74028e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


运行效果


![MovieList.png](http://upload-images.jianshu.io/upload_images/1233356-edbf264753a07175.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


![DetailActivity.png](http://upload-images.jianshu.io/upload_images/1233356-a78ce4d36cd877b2.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)




### 14.2.2  工程说明


AndroidManifest.xml

```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.easy.kotlin">

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">
        <activity
            android:name=".ItemListActivity"
            android:label="@string/app_name"
            android:theme="@style/AppTheme.NoActionBar">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
        <activity
            android:name=".ItemDetailActivity"
            android:label="@string/title_item_detail"
            android:parentActivityName=".ItemListActivity"
            android:theme="@style/AppTheme.NoActionBar">
            <meta-data
                android:name="android.support.PARENT_ACTIVITY"
                android:value="com.easy.kotlin.ItemListActivity" />
        </activity>
    </application>

</manifest>

```


其中 android.intent.action.MAIN 处的配置指定了应用程序的启动Activity 为 .ItemListActivity , 其中的点号 “.” 表示该类位于 package="com.easy.kotlin" 路径下。

```xml
        <activity
            android:name=".ItemListActivity"
            android:label="@string/app_name"
            android:theme="@style/AppTheme.NoActionBar">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
```


下面我们来介绍应用程序的启动主类 ItemListActivity 。

####  ItemListActivity

Kotlin 代码如下

```kotlin
package com.easy.kotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.support.design.widget.Snackbar
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.easy.kotlin.dummy.DummyContent
import kotlinx.android.synthetic.main.activity_item_list.*
import kotlinx.android.synthetic.main.item_list_content.view.*

import kotlinx.android.synthetic.main.item_list.*

/**
 * An activity representing a list of Pings. This activity
 * has different presentations for handset and tablet-size devices. On
 * handsets, the activity presents a list of items, which when touched,
 * lead to a [ItemDetailActivity] representing
 * item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 */
class ItemListActivity : AppCompatActivity() {

    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private var mTwoPane: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_list)

        setSupportActionBar(toolbar)
        toolbar.title = title

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        if (item_detail_container != null) {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-w900dp).
            // If this view is present, then the
            // activity should be in two-pane mode.
            mTwoPane = true
        }

        setupRecyclerView(item_list)
    }

    private fun setupRecyclerView(recyclerView: RecyclerView) {
        recyclerView.adapter = SimpleItemRecyclerViewAdapter(this, DummyContent.ITEMS, mTwoPane)
    }

    class SimpleItemRecyclerViewAdapter(private val mParentActivity: ItemListActivity,
                                        private val mValues: List<DummyContent.DummyItem>,
                                        private val mTwoPane: Boolean) :
            RecyclerView.Adapter<SimpleItemRecyclerViewAdapter.ViewHolder>() {

        private val mOnClickListener: View.OnClickListener

        init {
            mOnClickListener = View.OnClickListener { v ->
                val item = v.tag as DummyContent.DummyItem
                if (mTwoPane) {
                    val fragment = ItemDetailFragment().apply {
                        arguments = Bundle()
                        arguments.putString(ItemDetailFragment.ARG_ITEM_ID, item.id)
                    }
                    mParentActivity.supportFragmentManager
                            .beginTransaction()
                            .replace(R.id.item_detail_container, fragment)
                            .commit()
                } else {
                    val intent = Intent(v.context, ItemDetailActivity::class.java).apply {
                        putExtra(ItemDetailFragment.ARG_ITEM_ID, item.id)
                    }
                    v.context.startActivity(intent)
                }
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_list_content, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = mValues[position]
            holder.mIdView.text = item.id
            holder.mContentView.text = item.content

            with(holder.itemView) {
                tag = item
                setOnClickListener(mOnClickListener)
            }
        }

        override fun getItemCount(): Int {
            return mValues.size
        }

        inner class ViewHolder(mView: View) : RecyclerView.ViewHolder(mView) {
            val mIdView: TextView = mView.id_text
            val mContentView: TextView = mView.content
        }
    }
}

```

布局文件 XML 代码 activity_item_list.xml 

```xml
<?xml version="1.0" encoding="utf-8"?>
<android.support.design.widget.CoordinatorLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:fitsSystemWindows="true"
    tools:context="com.easy.kotlin.ItemListActivity">

    <android.support.design.widget.AppBarLayout
        android:id="@+id/app_bar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:theme="@style/AppTheme.AppBarOverlay">

        <android.support.v7.widget.Toolbar
            android:id="@+id/toolbar"
            android:layout_width="match_parent"
            android:layout_height="?attr/actionBarSize"
            app:popupTheme="@style/AppTheme.PopupOverlay" />

    </android.support.design.widget.AppBarLayout>

    <FrameLayout
        android:id="@+id/frameLayout"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:layout_behavior="@string/appbar_scrolling_view_behavior">

        <include layout="@layout/item_list" />
    </FrameLayout>

    <android.support.design.widget.FloatingActionButton
        android:id="@+id/fab"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="bottom|end"
        android:layout_margin="@dimen/fab_margin"
        app:srcCompat="@android:drawable/ic_dialog_email" />


</android.support.design.widget.CoordinatorLayout>

```

对应的 UI 设计效果图如下


![ XML 代码 activity_item_list.xml  设计效果图](http://upload-images.jianshu.io/upload_images/1233356-7c997691308a62ee.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)




#### AppCompatActivity

在使用Android Studio开发Android应用的时候，创建项目时，自动继承的是AppCompatActivity。这样我们可以在自定义的 Activity 类中添加 android.support.v7.app.ActionBar（ API level 7 +）。例如activity_item_list.xml  布局中的

```xml
    <android.support.design.widget.AppBarLayout
        android:id="@+id/app_bar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:theme="@style/AppTheme.AppBarOverlay">

        <android.support.v7.widget.Toolbar
            android:id="@+id/toolbar"
            android:layout_width="match_parent"
            android:layout_height="?attr/actionBarSize"
            app:popupTheme="@style/AppTheme.PopupOverlay" />

    </android.support.design.widget.AppBarLayout>
```

Activity 中添加 Toolbar 的代码是
```kotlin
class ItemListActivity : AppCompatActivity() {

    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private var mTwoPane: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_list)

        setSupportActionBar(toolbar)
        toolbar.title = title

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        if (item_detail_container != null) {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-w900dp).
            // If this view is present, then the
            // activity should be in two-pane mode.
            mTwoPane = true
        }

        setupRecyclerView(item_list)
    }
}
```


AppCompatActivity 背后也是继承的 Activity 。推出Android 5.0之后，提供了很多新功能，于是 support v7 也更新了，出现了AppCompatActivity。AppCompatActivity 是用来替代ActionBarActivity的 。 AppCompatActivity 的类图继承层次如下


![AppCompatActivity 的类图继承层次](http://upload-images.jianshu.io/upload_images/1233356-ba0d12f33294b35b.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



#### Activity 生命周期

Activity 生命周期如下图所示（图来自官网）

![Activity 生命周期](http://upload-images.jianshu.io/upload_images/1233356-1d8c279dba147341.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

相信不少朋友也已经看过这个流程图了，关于Activity生命周期的几个过程，我们简单说明如下

1.开始启动Activity，系统会先调用onCreate方法，然后调用onStart方法，最后调用onResume，Activity进入运行状态。

2.当前Activity被其他Activity覆盖其上或被锁屏：系统会调用onPause方法，暂停当前Activity的执行。

3.当前Activity由被覆盖状态回到前台或解锁屏：系统会调用onResume方法，再次进入运行状态。

4.当前Activity转到新的Activity界面或按Home键回到主屏：系统会先调用onPause方法，然后调用onStop方法，进入停止状态。

5.用户后退回到此Activity：系统会先调用onRestart方法，然后调用onStart方法，最后调用onResume方法，再次进入运行状态。

6.当前Activity处于被覆盖状态或者后台不可见状态，即第2步和第4步，系统内存不足，杀死当前Activity，而后用户退回当前Activity：再次调用onCreate方法、onStart方法、onResume方法，进入运行状态。

7.用户退出当前Activity：系统先调用onPause方法，然后调用onStop方法，最后调用onDestory方法，结束当前Activity。


这个过程可以用下面的状态图来简单说明



![Android Activity 生命周期状态图](http://upload-images.jianshu.io/upload_images/1233356-4a4b2632b3d93897.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



####  Kotlin Android Extensions 插件

在上面的ItemListActivity.onCreate 函数中，其中的这行代码
```
setSupportActionBar(toolbar) 
```

是设置支持的 ActionBar方法。但是我们发现，这里并没有使用 findViewById()方法来获取这个  android:id="@+id/toolbar" Toolbar 的 View 对象，之前我们可能都是这样写的
```
Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
setSupportActionBar(toolbar);
```
而这里直接就使用了 toolbar 这个 Toolbar 的对象变量。这是怎么做到的呢？其实这是通过 Kotlin Android Extensions 插件做到的。我们在app 目录下的 Gradle 配置文件 build.gradle 中添加了这个配置

```
apply plugin: 'com.android.application'
apply plugin: 'kotlin-android'
apply plugin: 'kotlin-android-extensions'
```

有了这个插件我们就可以永远跟 findViewById 说再见了。Kotlin Android Extensions 插件是 Kotlin 针对 Android 开发专门定制的通用插件, 通过它我们能够以极简的无缝方式实现从  Activity, Fragment 和 View 布局组件中创建和获取视图 View 。使用 Kotlin 开发 Android 大大减少了我们的样板代码。

就像上面的示例代码一样，我们只要在代码中直接使用这个布局组件的 id 名称作为变量名即可，剩下的Kotlin 插件会帮我们全部搞定。Kotlin Android Extensions 插件将会为我们生成一些额外的代码，使得我们可以在布局XML中直接通过 id 获取到其 View 对象。另外，它还生成一个本地视图缓存，当第一次使用属性时，它将执行一个常规的findViewById。但在下一次使用属性的时候，视图将从缓存中恢复，因此访问速度将更快。

只要布局添加一个 View，在 Activity、View、Fragment 中都可以直接用 id 来引用这个 View，Kotlin 把 Android 编程极简风格发挥得淋漓尽致。

我们可以通过Kotlin 对应的字节码来更加本质深入地理解 Kotlin 所做的事情。Android Studio 中跟 IDEA 一样提供了 Kotlin 的工具箱。在菜单栏中依次选择 Code > Kotlin > Show Kotlin Bytecode , 如下图所示


![Show Kotlin Bytecode ](http://upload-images.jianshu.io/upload_images/1233356-9b24df12e99a494c.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

点击 Show Kotlin Bytecode 之后，我们将会看到如下图所示的 Kotlin Bytecode 界面


![Kotlin Bytecode 界面](http://upload-images.jianshu.io/upload_images/1233356-9a92316a6e05d1d4.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

其中这两行代码
```kotlin
setSupportActionBar(toolbar)
toolbar.title = title
```
对应的字节码是

```
    LINENUMBER 39 L2
    ALOAD 0
    ALOAD 0
    GETSTATIC com/easy/kotlin/R$id.toolbar : I
    INVOKEVIRTUAL com/easy/kotlin/ItemListActivity._$_findCachedViewById (I)Landroid/view/View;
    CHECKCAST android/support/v7/widget/Toolbar
    INVOKEVIRTUAL com/easy/kotlin/ItemListActivity.setSupportActionBar (Landroid/support/v7/widget/Toolbar;)V
   L3
    LINENUMBER 40 L3
    ALOAD 0
    GETSTATIC com/easy/kotlin/R$id.toolbar : I
    INVOKEVIRTUAL com/easy/kotlin/ItemListActivity._$_findCachedViewById (I)Landroid/view/View;
    CHECKCAST android/support/v7/widget/Toolbar
    ALOAD 0
    INVOKEVIRTUAL com/easy/kotlin/ItemListActivity.getTitle ()Ljava/lang/CharSequence;
    INVOKEVIRTUAL android/support/v7/widget/Toolbar.setTitle (Ljava/lang/CharSequence;)V
   L4

```
其实从字节码中
```
GETSTATIC com/easy/kotlin/R$id.toolbar : I
    INVOKEVIRTUAL com/easy/kotlin/ItemListActivity._$_findCachedViewById 
```
我们已经看到了 Kotlin 为我们所做的事情了。反编译成 Java 代码可能会看的更加清楚

```java
public final class ItemListActivity extends AppCompatActivity {
   private boolean mTwoPane;
   private HashMap _$_findViewCache;

   protected void onCreate(@Nullable Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      this.setContentView(2131361820);
      this.setSupportActionBar((Toolbar)this._$_findCachedViewById(id.toolbar));
      ((Toolbar)this._$_findCachedViewById(id.toolbar)).setTitle(this.getTitle());
      ...
   }

   public View _$_findCachedViewById(int var1) {
      if(this._$_findViewCache == null) {
         this._$_findViewCache = new HashMap();
      }

      View var2 = (View)this._$_findViewCache.get(Integer.valueOf(var1));
      if(var2 == null) {
         var2 = this.findViewById(var1);
         this._$_findViewCache.put(Integer.valueOf(var1), var2);
      }

      return var2;
   }
   ...
}
```
其中的ItemListActivity 类中的 HashMap 类型的私有成员变量  _$_findViewCache 就是本地缓存。这里其实反映出 Kotlin 语言设计的核心思想：通过更高一层的对 Java 的封装，不仅大大简化了程序员的样板化的代码量，同时还根据一些特定的可以优化的问题场景，顺带提供了更好的性能。

同样的，上面的代码中的 fab 变量

```kotlin
fab.setOnClickListener { view ->
    Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
            .setAction("Action", null).show()
}
```
也是直接使用的布局 XML 中的 android:id="@+id/fab"

```xml
    <android.support.design.widget.FloatingActionButton
        android:id="@+id/fab"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="bottom|end"
        android:layout_margin="@dimen/fab_margin"
        app:srcCompat="@android:drawable/ic_dialog_email" />
```


 item_detail_container 、setupRecyclerView(item_list)中的 item_list 都是使用上面的方式。这样代码确实是大大精简了许多。



#### 嵌套 Layout 布局

上面的 activity_item_list.xml  布局中嵌套的 FrameLayout 布局配置如下
```xml
    <FrameLayout
        android:id="@+id/frameLayout"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:layout_behavior="@string/appbar_scrolling_view_behavior">

        <include layout="@layout/item_list" />

    </FrameLayout>
```

里面的 <include layout="@layout/item_list" /> 表示引用 layout 文件夹下面的 item_list.xml 

```xml
<?xml version="1.0" encoding="utf-8"?>
<android.support.v7.widget.RecyclerView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/item_list"
    android:name="com.easy.kotlin.ItemListFragment"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:layout_marginLeft="16dp"
    android:layout_marginRight="16dp"
    app:layoutManager="LinearLayoutManager"
    tools:context="com.easy.kotlin.ItemListActivity"
    tools:listitem="@layout/item_list_content" />
```


![item_list.xml 布局 UI](http://upload-images.jianshu.io/upload_images/1233356-562088fcced82bf6.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


而布局 item_list.xml  中的 tools:listitem="@layout/item_list_content" 表示又引用了layout 文件夹下面的 item_list_content.xml 布局文件。

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:orientation="horizontal">

    <TextView
        android:id="@+id/id_text"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="@dimen/text_margin"
        android:textAppearance="?attr/textAppearanceListItem" />

    <TextView
        android:id="@+id/content"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="@dimen/text_margin"
        android:textAppearance="?attr/textAppearanceListItem" />
</LinearLayout>

```



![item_list_content.xml 布局 UI](http://upload-images.jianshu.io/upload_images/1233356-c29b364a7e14f38d.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)





#### ItemDetailActivity

这个是 Item 详情页的Activity 。Kotlin 代码如下

```kotlin
package com.easy.kotlin

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_item_detail.*

/**
 * An activity representing a single Item detail screen. This
 * activity is only used on narrow width devices. On tablet-size devices,
 * item details are presented side-by-side with a list of items
 * in a [ItemListActivity].
 */
class ItemDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_detail)
        setSupportActionBar(detail_toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own detail action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        // Show the Up button in the action bar.
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // savedInstanceState is non-null when there is fragment state
        // saved from previous configurations of this activity
        // (e.g. when rotating the screen from portrait to landscape).
        // In this case, the fragment will automatically be re-added
        // to its container so we don't need to manually add it.
        // For more information, see the Fragments API guide at:
        //
        // http://developer.android.com/guide/components/fragments.html
        //
        if (savedInstanceState == null) {
            // Create the detail fragment and add it to the activity
            // using a fragment transaction.
            val arguments = Bundle()
            arguments.putString(ItemDetailFragment.ARG_ITEM_ID,
                    intent.getStringExtra(ItemDetailFragment.ARG_ITEM_ID))
            val fragment = ItemDetailFragment()
            fragment.arguments = arguments
            supportFragmentManager.beginTransaction()
                    .add(R.id.item_detail_container, fragment)
                    .commit()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem) =
            when (item.itemId) {
                android.R.id.home -> {
                    // This ID represents the Home or Up button. In the case of this
                    // activity, the Up button is shown. For
                    // more details, see the Navigation pattern on Android Design:
                    //
                    // http://developer.android.com/design/patterns/navigation.html#up-vs-back

                    navigateUpTo(Intent(this, ItemListActivity::class.java))
                    true
                }
                else -> super.onOptionsItemSelected(item)
            }
}

```

UI 布局 XML 文件 item_detail.xml 如下
```xml
<android.support.design.widget.CoordinatorLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:fitsSystemWindows="true"
    tools:context="com.easy.kotlin.ItemDetailActivity"
    tools:ignore="MergeRootFrame">

    <android.support.design.widget.AppBarLayout
        android:id="@+id/app_bar"
        android:layout_width="match_parent"
        android:layout_height="@dimen/app_bar_height"
        android:fitsSystemWindows="true"
        android:theme="@style/ThemeOverlay.AppCompat.Dark.ActionBar">

        <android.support.design.widget.CollapsingToolbarLayout
            android:id="@+id/toolbar_layout"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:fitsSystemWindows="true"
            app:contentScrim="?attr/colorPrimary"
            app:layout_scrollFlags="scroll|exitUntilCollapsed"
            app:toolbarId="@+id/toolbar">

            <android.support.v7.widget.Toolbar
                android:id="@+id/detail_toolbar"
                android:layout_width="match_parent"
                android:layout_height="?attr/actionBarSize"
                app:layout_collapseMode="pin"
                app:popupTheme="@style/ThemeOverlay.AppCompat.Light" />

        </android.support.design.widget.CollapsingToolbarLayout>

    </android.support.design.widget.AppBarLayout>

    <android.support.v4.widget.NestedScrollView
        android:id="@+id/item_detail_container"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:layout_behavior="@string/appbar_scrolling_view_behavior" />

    <android.support.design.widget.FloatingActionButton
        android:id="@+id/fab"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_vertical|start"
        android:layout_margin="@dimen/fab_margin"
        app:layout_anchor="@+id/item_detail_container"
        app:layout_anchorGravity="top|end"
        app:srcCompat="@android:drawable/stat_notify_chat" />

</android.support.design.widget.CoordinatorLayout>

```

打开item_detail.xml ，我们可以看到设计图 UI 的效果


![item_detail.xml UI 设计图](http://upload-images.jianshu.io/upload_images/1233356-96de18b2b3815a60.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

我们可以看到详情页的布局主要有3大块：AppBarLayout 、NestedScrollView和 FloatingActionButton 。

在 ItemDetailActivity 的onCreate 函数里的
```
setContentView(R.layout.activity_item_detail)
```
设置详情页 ItemDetailActivity 的显示界面使用 activity_item_detail.xml 布局文件进行布局。

```
setSupportActionBar(detail_toolbar)
```
设置详情页的 android.support.v7.widget.Toolbar 控件布局。

下面我们来看在 ItemDetailActivity 中创建 ItemDetailFragment 的过程。代码如下

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
    ...
    if (savedInstanceState == null) { 
        // Create the detail fragment and add it to the activity
        // using a fragment transaction.
        val arguments = Bundle()
        arguments.putString(ItemDetailFragment.ARG_ITEM_ID,
                intent.getStringExtra(ItemDetailFragment.ARG_ITEM_ID))
        val fragment = ItemDetailFragment()
        fragment.arguments = arguments
        supportFragmentManager.beginTransaction()
                .add(R.id.item_detail_container, fragment)
                .commit()
    }
}
```


1. 首先我们判断当前 savedInstanceState 是否为空。如果为空， 执行步骤2 。 
2. 创建 ItemDetailFragment() 对象，并设置其 Bundle 信息（Fragment 中的成员变量  mArguments ）

```kotlin
val arguments = Bundle()
arguments.putString(ItemDetailFragment.ARG_ITEM_ID,
        intent.getStringExtra(ItemDetailFragment.ARG_ITEM_ID))
val fragment = ItemDetailFragment()
fragment.arguments = arguments
```

3. 通过 supportFragmentManager 添加 Fragment 与布局空间的映射关系。
```kotlin
supportFragmentManager.beginTransaction()
        .add(R.id.item_detail_container, fragment)
        .commit()
```


其中，supportFragmentManager 用来获取能管理和当前 Activity 有关联的Fragment的 FragmentManager，使用supportFragmentManager 我们可以向Activity 状态中添加一个Fragment 。



上面代码中的 R.id.item_detail_container 对应的布局是一个 NestedScrollView ，代码如下

```xml
<android.support.v4.widget.NestedScrollView
    android:id="@+id/item_detail_container"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:layout_behavior="@string/appbar_scrolling_view_behavior" />
```

UI 界面设计效果如下图所示

![ R.id.item_detail_container 对应的布局是一个 NestedScrollView ](http://upload-images.jianshu.io/upload_images/1233356-4a1d8de798e70e9b.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



最后需要注意的是，如果当前 Activity 在前面已经保存了 Fragment 状态数据，那么 savedInstanceState 的值就是非空的， 这个时候我们就不需要手动再去手工创建 Fragment 对象保存到当前的 Activity 中了。因为当我们的 Activty 被异常销毁时，Activity会对自身状态进行保存（这里面包含了我们添加的Fragment）。而在Activity被重新创建时，又会对我们之前保存的 Fragment 进行恢复。

所以，添加 Fragment 前千万要记得去检查是否有保存的Activity状态。如果没有状态保存，说明Acitvity是第1次被创建，我们添加Fragment。如果有状态保存，说明 Activity 刚刚出现过异常被销毁过，之前的 Fragment 会被恢复，我们不再添加 Fragment。



#### FragmentTransaction

上面的代码中，我们使用了 FragmentTransaction 的 add 方法，该方法签名如下

```java
public abstract FragmentTransaction add(@IdRes int containerViewId, Fragment fragment);
```

其中参数 containerViewId 传入 Activity 中某个视图容器的 id。如果containerViewId 传 0，则这个Fragment不会被放置在一个容器中。请注意，不要认为 Fragment 没添加进来，其实我们只是添加了一个没有视图的Fragment 而已，这个Fragment可以用来做一些类似于Service的后台工作。


FragmentTransaction 常用的 API 如下表

|  API 方法  |  说明  |
|---|---|
|add(int containerViewId, Fragment fragment, String tag) | 向Activity state中添加一个Fragment。参数containerViewId一般会传Activity中某个视图容器的id。如果containerViewId传0，则这个Fragment不会被放置在一个容器中。添加Fragment前检查是否有保存的Activity状态。|
|remove(Fragment fragment)|移除一个已经存在的Fragment。Fragment被remove后，Fragment的生命周期会一直执行完onDetach，之后Fragment的实例也会从FragmentManager中移除。|
|replace(int containerViewId, Fragment fragment)|替换一个已被添加进视图容器的Fragment。之前添加的Fragment 会在 replace 时被视图容器移除。 |
|addToBackStack(String name)|记录已提交的事务（transation），可用于回退操作。参数 name是这次回退操作的一个名称（或标识），不需要可以传null。|
|show(Fragment fragment) | 隐藏一个存在的Fragment。|
|hide(Fragment fragment) | 显示一个以前被隐藏过的Fragment。Fragment被hide/show，仅仅是隐藏/显示Fragment的视图，不会有任何生命周期方法的调用。在Fragment中重写onHiddenChanged方法可以对Fragment的hide和show状态进行监听。 |
|attach(Fragment fragment)|重新关联一个Fragment（当这个Fragment的detach执行之后）。当Fragment被detach后，执行attach操作，会让Fragment从onCreateView开始执行，一直执行到onResume。attach无法像add一样单独使用，单独使用会抛异常。方法存在的意义是对detach后的Fragment进行界面恢复。|
|detach(Fragment fragment)|分离指定Fragment的UI视图。当Fragment被detach后，Fragment的生命周期执行完onDestroyView就终止了，这意味着Fragment的实例并没有被销毁，只是UI界面被移除了（注意和remove是有区别的）。|
|setCustomAnimations(int enter, int exit)|为Fragment的进入/退出设置指定的动画资源。|
|commit()|提交事务。安排一个针对该事务的提交。提交并没有立刻发生，会安排到在主线程下次准备好的时候来执行。|
|commitNow() |同步的提交这个事务。任何被添加的Fragment都将会被初始化，并将他们完全带入他们的生命周期状态。 使用commitNow()时不能进行添加回退栈的操作，如果使用 addToBackStack(String)将会抛出一个 IllegalStateException的异常。|






下面我们来介绍 ItemDetailFragment 。

#### ItemDetailFragment

 这个 ItemDetailFragment 表示单个 Item 详细信息。此片段在双窗格模式 (在平板电脑上) 包含在 ItemListActivity 中，在手机上则是包含在ItemDetailActivity中。其 Kotlin 代码如下

```kotlin
package com.easy.kotlin

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.easy.kotlin.dummy.DummyContent
import kotlinx.android.synthetic.main.activity_item_detail.*
import kotlinx.android.synthetic.main.item_detail.view.*

class ItemDetailFragment : Fragment() {

    /**
     * 测试数据 dummy content this fragment is presenting.
     */
    private var mItem: DummyContent.DummyItem? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (arguments.containsKey(ARG_ITEM_ID)) {
            // 加载数据
            mItem = DummyContent.ITEM_MAP[arguments.getString(ARG_ITEM_ID)]
            mItem?.let {
                // 给 toolbar_layout 布局设置标题
                activity.toolbar_layout?.title = it.content 
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.item_detail, container, false)

        // 在 TextView 中显示测试数据文本
        mItem?.let {
            rootView.item_detail.text = it.details
        }

        return rootView
    }

    companion object {
        /**
         * The fragment argument representing the item ID that this fragment
         * represents.
         */
        const val ARG_ITEM_ID = "item_id"
    }
}

```
在 onCreate 中，activity.toolbar_layout?.title = it.content 这行代码是给详情页ToolBar 的大标题赋值

```
<android.support.design.widget.AppBarLayout
    android:id="@+id/app_bar"
    android:layout_width="match_parent"
    android:layout_height="@dimen/app_bar_height"
    android:fitsSystemWindows="true"
    android:theme="@style/ThemeOverlay.AppCompat.Dark.ActionBar">

    <android.support.design.widget.CollapsingToolbarLayout
        android:id="@+id/toolbar_layout"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:fitsSystemWindows="true"
        app:contentScrim="?attr/colorPrimary"
        app:layout_scrollFlags="scroll|exitUntilCollapsed"
        app:toolbarId="@+id/toolbar">

        <android.support.v7.widget.Toolbar
            android:id="@+id/detail_toolbar"
            android:layout_width="match_parent"
            android:layout_height="?attr/actionBarSize"
            app:layout_collapseMode="pin"
            app:popupTheme="@style/ThemeOverlay.AppCompat.Light" />

    </android.support.design.widget.CollapsingToolbarLayout>

</android.support.design.widget.AppBarLayout>
```

对应的 UI 如下图


![详情页ToolBar ](http://upload-images.jianshu.io/upload_images/1233356-de23009ee44431e6.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


在 onCreateView中， rootView.item_detail.text = it.details 该行代码对应的布局是单个 Item 的详情展示 TextView 视图，其布局 XML 代码 item_detail.xml  如下

```xml
<TextView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/item_detail"
    style="?android:attr/textAppearanceLarge"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp"
    android:textIsSelectable="true"
    tools:context="com.easy.kotlin.ItemDetailFragment" />
```

UI 效果图是


![Item 详情 UI](http://upload-images.jianshu.io/upload_images/1233356-54fa9f9ff5878b23.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)








####  Fragment 生命周期



Fragment 必须嵌入在 Activity 中才能生存，其生命周期也直接受宿主 Activity 的生命周期的影响。比如，若宿主 Activity 处于 pause 状态，它所管辖的 Fragment 也将进入 pause 状态。而当 Activity 处于 resume 状态的时候，您可以独立地控制每一个 Fragment，如添加或删除等。为了创建Fragment，需要继承一个 Fragment 类，并实现 Fragment 的生命周期回调方法，如 onCreate(), onStart(), onPause(), onStop() 等。事实上，若需要在一个应用中加入 Fragment，只需要将原来的 Activity 替换为 Fragment，并将 Activity 的生命周期回调方法简单地改为 Fragment 的生命周期回调方法即可。Fragment 的生命周期如下所示： 

 

![Fragment 的生命周期](http://upload-images.jianshu.io/upload_images/1233356-7822a4010787ac5e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


另外， Fragment 与 Activity 的生命周期的对比图如下


![Fragment 与 Activity 的生命周期的对比](http://upload-images.jianshu.io/upload_images/1233356-ff49a7f6afb14266.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)




1.当一个fragment被创建的时候，它会经历以下状态.

onAttach()
onCreate()
onCreateView()
onActivityCreated()

2.当这个fragment对用户可见的时候，它会经历以下状态

onStart()
onResume()

3.当这个fragment进入“后台模式”的时候，它会经历以下状态

onPause()
onStop()

4.当这个Fragment被销毁了（或者持有它的activity被销毁了），它会经历以下状态

onPause()
onStop()
onDestroyView()
onDetach()

5.就像 Activity 一样，在以下的状态中，可以使用Bundle对象保存一个Fragment的对象

onCreate()
onCreateView()
onActivityCreated()

6.Fragments的大部分状态都和 Activity 很相似，但 Fragment 有一些新的状态

onAttached() —— 当fragment和activity关联之后，调用这个方法。
onCreateView() —— 创建fragment中的视图的时候，调用这个方法。
onActivityCreated() —— 当activity的onCreate()方法被返回之后，调用这个方法。
onDestroyView() —— 当fragment中的视图被移除的时候，调用这个方法。
onDetach() —— 当fragment和activity分离的时候，调用这个方法。


一般来说，在 Fragment 中应至少重写下面3个生命周期方法：


- onCreate()
当创建 Fragment 实例时，系统回调的方法。在该方法中，需要对一些必要的组件进行初始化，以保证这个组件的实例在 Fragment 处于 pause或stop 状态时仍然存在。

 

- onCreateView()
当第一次在 Fragment 上绘制UI时，系统回调的方法。该方法返回一个 View 对象，该对象表示 Fragment 的根视图；若 Fragment 不需要展示视图，则该方法可以返回 null。

 

- onPause()
当用户离开 Fragment 时回调的方法（并不意味着该 Fragment 被销毁）。在该方法中，可以对 Fragment 的数据信息做一些持久化的保存工作，因为用户可能不再返回这个 Fragment。

 大多数情况下，需要重写上述三个方法，有时还需要重写其他生命周期方法。


当执行一个 Fragment 事务时，也可以将该 Fragment 加入到一个由宿主 Activity 管辖的后退栈中，并由 Activity 记录加入到后退栈的 Fragment 信息，按下后退键可以将 Fragment 从后退栈中一次弹出。

 

将 Fragment 添加至 Activity 的视图布局中有两种方式：一种是使用fragment标签加入，Fragment的父视图应是一个ViewGroup；另一种使用代码动态加入，并将一个ViewGroup作为Fragment的容器。在某些情况下，Fragment并不作为Activity视图展示的一部分，它可能只是用来作为非显示性的功能。



Fragment 是 Android 3.0 (API level 11) 新加入的API，主要的设置目的是为了使UI在不同的屏幕上表现得更加灵活。由于平板比手机屏幕大的多，因此平板上可以呈现更多的内容，而 Fragment 可以实现同一视图布局在不同大小的屏幕上显示不同的效果，将 Fragment 加入到 Activity 的 Layout 中，可以在运行时动态替换 Fragment 并将 Fragment 保存至 Activity 管辖的“后退栈”中。另外，同样的界面Activity占用内存比Fragment要多，在中低端手机上Fragment 比 Activity 都响应速度要快很多。

 




为了方便起见，继承下面这些特殊的Fragment可以简化其初始化过程：

 

DialogFragment：可展示一个悬浮的对话框。使用该类创建的对话框可以很好地替换由 Activity 类中的方法创建的对话框，因为您可以像管理其他 Fragment 一样管理 DialogFragment——它们都被压入由宿主 Activity 管理的 Fragment 栈中，这可以很方便的找回已被压入栈中的 Fragment。

 

ListFragment：可以展示一个内置的 AdapterView，该 AdapterView 由一个 Adapter 管理着，如 SimpleCursorAdapter。ListFragment 类似于 ListActivity，它提供了大量的用于管理 ListView 的方法，比如回调方法 onListItemClick()，它用于处理点击项事件。

 

PreferenceFragment：可以展示层级嵌套的 Preference 对象列表。PreferenceFragment 类似于 PreferenceActivity，该类一般用于为应用程序编写设置页面。

 

Fragment 绑定 UI 布局必须重写 onCreateView() 方法，为 Fragment 绑定布局，该方法返回的 View 就是 Fragment 的根视图

```kotlin
class ItemDetailFragment : Fragment() {

    private var mItem: DummyContent.DummyItem? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.item_detail, container, false)

        // Show the dummy content as text in a TextView.
        mItem?.let {
            rootView.item_detail.text = it.details
        }

        return rootView
    }
}
```

其中，val rootView = inflater.inflate(R.layout.item_detail, container, false) 这一行代码中的  inflater.inflate 是用于填充布局的, 这是布局填充器 LayoutInflater  类的方法。通常我们加载布局的任务都是在 Activity 中调用 setContentView() 方法来完成的。其实 setContentView() 方法的内部也是使用LayoutInflater 来加载布局的，相关的代码在 android.support.v7.app.AppCompatDelegateImplV9 中
```java
    @Override
    public void setContentView(int resId) {
        ensureSubDecor();
        ViewGroup contentParent = (ViewGroup) mSubDecor.findViewById(android.R.id.content);
        contentParent.removeAllViews();
        LayoutInflater.from(mContext).inflate(resId, contentParent);
        mOriginalWindowCallback.onContentChanged();
    }
```

在实际开发中 LayoutInflater 这个类还是非常有用的，它的作用类似于findViewById()。不同点是LayoutInflater 是用来找  res/layout/ 下的 xml 布局文件并实例化（填充布局）；而 findViewById() 是找 xml 布局文件下的具体widget控件(如Button、TextView等) 并实例化。

具体作用说明如下：

1、对于一个没有被载入或者想要动态载入的界面，都需要使用LayoutInflater.inflate()来载入；

2、对于一个已经载入的界面，就可以使用Activiyt.findViewById()方法来获得其中的界面元素。

注意：若继承的 Fragment 是 ListFragment，onCreateView() 方法已默认返回了 ListView 对象，故无需再重写该方法。




有关 Fragment 的更多信息，请参见“Fragment API指南” （http://developer.android.com/guide/components/fragments.html）。






#### DummyContent

这个类中构造了我们在 ListActivity 中展示的测试数据。代码如下


```kotlin
package com.easy.kotlin.dummy

import java.util.ArrayList
import java.util.HashMap

object DummyContent {

    val ITEMS: MutableList<DummyItem> = ArrayList()
    val ITEM_MAP: MutableMap<String, DummyItem> = HashMap()

    private val COUNT = 25

    init {
        // Add some sample items.
        for (i in 1..COUNT) {
            addItem(createDummyItem(i))
        }
    }

    private fun addItem(item: DummyItem) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }

    private fun createDummyItem(position: Int): DummyItem {
        return DummyItem(position.toString(), "Item " + position, makeDetails(position))
    }

    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about Item: ").append(position)
        for (i in 0..position - 1) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }

    data class DummyItem(val id: String, val content: String, val details: String) {
        override fun toString(): String = content
    }
}

```

至此，我们已经了解了怎样使用 Android Studio 3.0 创建一个带 ListActivity 和Fragment 的列表及其详情页展示，同时学习了 Activity 和 Fragment 的基本用法。下面我们来实现后端 API 的接入与数据的展现。

### 14.2.3  实现后端 API 的接入

在本节中我们将实现后端 API 的接入及其数据展示的逻辑。

#### 新建领域对象类 Movie

```kotlin
data class Movie(val id: String, val title: String, val overview: String, val posterPath: String) {
    override fun toString(): String {
        return "Movie(id='$id', title='$title', overview='$overview', posterPath='$posterPath')"
    }
}
```

#### API 返回的数据结构与解析
我们调用的 API 是 
```
val VOTE_AVERAGE_API = "http://api.themoviedb.org//3/discover/movie?certification_country=US&certification=R&sort_by=vote_average.desc&api_key=7e55a88ece9f03408b895a96c1487979"
```
 它的数据返回是


```json
{
  "page": 1,
  "total_results": 10350,
  "total_pages": 518,
  "results": [
    {
      "vote_count": 28,
      "id": 138878,
      "video": false,
      "vote_average": 10,
      "title": "Fatal Mission",
      "popularity": 3.721883,
      "poster_path": "/u351Rsqu5nd36ZpbWxIpd3CpbJW.jpg",
      "original_language": "en",
      "original_title": "Fatal Mission",
      "genre_ids": [
        10752,
        28,
        12
      ],
      "backdrop_path": "/wNq5uqVDT7a5G1b97ffYf4hxzYz.jpg",
      "adult": false,
      "overview": "A CIA Agent must rely on reluctant help from a female spy in the North Vietnam jungle in order to pass through enemy lines.",
      "release_date": "1990-07-25"
    },
    ...
    ]
}
```

我们使用 fastjson 来解析这个数据。在 app 下面的 build.gradle中添加依赖

```
dependencies {
    ...

    // https://mvnrepository.com/artifact/com.alibaba/fastjson
    compile group: 'com.alibaba', name: 'fastjson', version: '1.2.39'
}
```

解析代码如下

```kotlin
val jsonstr = URL(VOTE_AVERAGE_API).readText(Charset.defaultCharset())
try {
    val obj = JSON.parse(jsonstr) as Map<*, *>
    val dataArray = obj.get("results") as JSONArray
    }

} catch (ex: Exception) {

}
```
然后我们把这个 dataArray 放到我们的 MovieContent 对象中
```kotlin
dataArray.forEachIndexed { index, it ->
        val title = (it as Map<*, *>).get("title") as String
        val overview = it.get("overview") as String
        val poster_path = it.get("poster_path") as String
        addMovie(Movie(index.toString(), title, overview, getPosterUrl(poster_path)))
}
```
 其中，addMovie 的代码是

```
object MovieContent {

val MOVIES: MutableList<Movie> = ArrayList()
val MOVIE_MAP: MutableMap<String, Movie> = HashMap()
...
private fun addMovie(movie: Movie) {
    MOVIES.add(movie)
    MOVIE_MAP.put(movie.id, movie)
}
}
```

然后，我们再新建 MovieDetailActivity、MovieDetailFragment、MovieListActivity 以及 activity_movie_list.xml、activity_movie_detail.xml 、 movie_detail.xml、movie_list.xml、movie_list_content.xml ，它们的代码分别介绍如下。

#### 电影列表页面
MovieListActivity 是电影列表页面的 Activity，代码如下

```kotlin
package com.easy.kotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.easy.kotlin.bean.MovieContent
import com.easy.kotlin.util.HttpUtil
import kotlinx.android.synthetic.main.activity_movie_detail.*
import kotlinx.android.synthetic.main.activity_movie_list.*
import kotlinx.android.synthetic.main.movie_list.*
import kotlinx.android.synthetic.main.movie_list_content.view.*


class MovieListActivity : AppCompatActivity() {

    private var mTwoPane: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)

        setSupportActionBar(toolbar)
        toolbar.title = title

        if (movie_detail_container != null) {
            mTwoPane = true
        }

        setupRecyclerView(movie_list)
    }

    private fun setupRecyclerView(recyclerView: RecyclerView) {
        recyclerView.adapter = SimpleItemRecyclerViewAdapter(this, MovieContent.MOVIES, mTwoPane)
    }

    class SimpleItemRecyclerViewAdapter(private val mParentActivity: MovieListActivity,
                                        private val mValues: List<MovieContent.Movie>,
                                        private val mTwoPane: Boolean) : RecyclerView.Adapter<SimpleItemRecyclerViewAdapter.ViewHolder>() {

        private val mOnClickListener: View.OnClickListener

        init {
            mOnClickListener = View.OnClickListener { v ->
                val item = v.tag as MovieContent.Movie
                if (mTwoPane) {
                    val fragment = MovieDetailFragment().apply {
                        arguments = Bundle()
                        arguments.putString(MovieDetailFragment.ARG_MOVIE_ID, item.id)
                    }
                    mParentActivity.supportFragmentManager
                            .beginTransaction()
                            .replace(R.id.movie_detail_container, fragment)
                            .commit()
                } else {
                    val intent = Intent(v.context, MovieDetailActivity::class.java).apply {
                        putExtra(MovieDetailFragment.ARG_MOVIE_ID, item.id)
                    }
                    v.context.startActivity(intent)
                }
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view =
                    LayoutInflater
                            .from(parent.context)
                            .inflate(R.layout.movie_list_content, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = mValues[position]
            holder.mIdView.text = item.id
            holder.mTitle.text = item.title
            holder.mMoviePosterImageView.setImageBitmap(HttpUtil.getBitmapFromURL(item.posterPath))

            with(holder.itemView) {
                tag = item
                setOnClickListener(mOnClickListener)
            }
        }

        override fun getItemCount(): Int {
            return mValues.size
        }

        inner class ViewHolder(mView: View) : RecyclerView.ViewHolder(mView) {
            val mIdView: TextView = mView.id_text
            val mTitle: TextView = mView.title
            val mMoviePosterImageView: ImageView = mView.movie_poster_image

        }
    }
}

```

对应的布局文件如下



activity_movie_list.xml

```xml
<?xml version="1.0" encoding="utf-8"?>
<android.support.design.widget.CoordinatorLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:fitsSystemWindows="true"
    tools:context="com.easy.kotlin.MovieListActivity">

    <android.support.design.widget.AppBarLayout
        android:id="@+id/app_bar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:theme="@style/AppTheme.AppBarOverlay">

        <android.support.v7.widget.Toolbar
            android:id="@+id/toolbar"
            android:layout_width="match_parent"
            android:layout_height="?attr/actionBarSize"
            app:popupTheme="@style/AppTheme.PopupOverlay" />

    </android.support.design.widget.AppBarLayout>

    <FrameLayout
        android:id="@+id/frameLayout"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:layout_behavior="@string/appbar_scrolling_view_behavior">

        <include layout="@layout/movie_list" />
    </FrameLayout>

</android.support.design.widget.CoordinatorLayout>

```

movie_list.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<android.support.v7.widget.RecyclerView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/movie_list"
    android:name="com.easy.kotlin.MovieListFragment"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:layout_marginLeft="16dp"
    android:layout_marginRight="16dp"
    app:layoutManager="LinearLayoutManager"
    tools:context="com.easy.kotlin.MovieListActivity"
    tools:listitem="@layout/movie_list_content" />

```


movie_list_content.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="320dp"
    android:layout_gravity="center"
    android:layout_margin="0dp"
    android:clickable="true"
    android:foreground="?attr/selectableItemBackground"
    android:orientation="horizontal">

    <TextView
        android:id="@+id/id_text"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="@dimen/text_margin"
        android:textAppearance="?attr/textAppearanceListItem" />

    <ImageView
        android:id="@+id/movie_poster_image"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:scaleType="centerCrop" />

    <View
        android:id="@+id/title_background"
        android:layout_width="match_parent"
        android:layout_height="48dp"
        android:layout_gravity="bottom"
        android:alpha="0.8"
        android:background="@color/colorPrimaryDark"
        android:gravity="center" />

    <TextView
        android:id="@+id/title"
        android:layout_width="match_parent"
        android:layout_height="48dp"
        android:layout_gravity="bottom"
        android:gravity="center"
        android:paddingLeft="@dimen/activity_horizontal_margin"
        android:paddingRight="@dimen/activity_horizontal_margin"
        android:textColor="@android:color/white"
        android:textSize="12sp" />

</FrameLayout>

```

电影列表的整体布局的 UI 如下图所示


![电影列表的整体布局的 UI ](http://upload-images.jianshu.io/upload_images/1233356-447103ad47e5abb3.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



#### 视图数据适配器 ViewAdapter 

我们在创建 MovieListActivity 过程中需要展示响应的数据，这些数据由 ViewAdapter 来承载，对应的代码如下

``` kotlin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)

        setSupportActionBar(toolbar)
        toolbar.title = title

        if (movie_detail_container != null) {
            mTwoPane = true
        }

        setupRecyclerView(movie_list)
    }

    private fun setupRecyclerView(recyclerView: RecyclerView) {
        recyclerView.adapter = SimpleItemRecyclerViewAdapter(this, MovieContent.MOVIES, mTwoPane)
    }
```

在上面代码中，我们定义了一个继承 RecyclerView.Adapter  的 SimpleItemRecyclerViewAdapter 类来装载  View 中要显示的数据，实现数据与视图的解耦。View 要显示的数据从Adapter里面获取并展现出来。Adapter负责把真实的数据是配成一个个View，也就是说View要显示什么数据取决于Adapter里面的数据。

#### 视图中图像的展示

其中，在函数 SimpleItemRecyclerViewAdapter.onBindViewHolder 中，我们设置 View 组件与Model 数据的绑定。其中的电影海报是图片，所以我们的布局文件中使用了 ImageView，对应的布局文件是 movie_list_content.xml ，代码如下

```xml
<?xml version="1.0" encoding="utf-8"?>
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="320dp"
    android:layout_gravity="center"
    android:layout_margin="0dp"
    android:clickable="true"
    android:foreground="?attr/selectableItemBackground"
    android:orientation="horizontal">

    <TextView
        android:id="@+id/id_text"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="@dimen/text_margin"
        android:textAppearance="?attr/textAppearanceListItem" />

    <ImageView
        android:id="@+id/movie_poster_image"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:scaleType="centerCrop" />

    <View
        android:id="@+id/title_background"
        android:layout_width="match_parent"
        android:layout_height="48dp"
        android:layout_gravity="bottom"
        android:alpha="0.8"
        android:background="@color/colorPrimaryDark"
        android:gravity="center" />

    <TextView
        android:id="@+id/title"
        android:layout_width="match_parent"
        android:layout_height="48dp"
        android:layout_gravity="bottom"
        android:gravity="center"
        android:paddingLeft="@dimen/activity_horizontal_margin"
        android:paddingRight="@dimen/activity_horizontal_margin"
        android:textColor="@android:color/white"
        android:textSize="12sp" />




</FrameLayout>

```
UI 设计效果图


![MovieListActivity 布局 UI ](http://upload-images.jianshu.io/upload_images/1233356-aebd3c75d2813212.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


#### 列表中图片的展示

关于图片的视图组件是 ImageView
```xml
    <ImageView
        android:id="@+id/movie_poster_image"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:scaleType="centerCrop" />
```
我们这里是根据图片的 URL 来展示图片，ImageView 类有个setImageBitmap 方法，可以直接设置 Bitmap 图片数据

```
holder.mMoviePosterImageView.setImageBitmap(HttpUtil.getBitmapFromURL(item.posterPath))
```

而通过 url 获取Bitmap 图片数据的代码是
```kotlin
object HttpUtil {
    fun getBitmapFromURL(src: String): Bitmap? {
        try {
            val url = URL(src)
            val input = url.openStream()
            val myBitmap = BitmapFactory.decodeStream(input)
            return myBitmap
        } catch (e: Exception) {
            e.printStackTrace()
            return null
        }
    }
}
```



#### 电影详情页面

MovieDetailActivity 是电影详情页面，代码如下

```kotlin
package com.easy.kotlin

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_movie_detail.*

class MovieDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        setSupportActionBar(detail_toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own detail action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        if (savedInstanceState == null) {
            val arguments = Bundle()
            arguments.putString(MovieDetailFragment.ARG_MOVIE_ID,
                    intent.getStringExtra(MovieDetailFragment.ARG_MOVIE_ID))
            val fragment = MovieDetailFragment()
            fragment.arguments = arguments
            supportFragmentManager.beginTransaction()
                    .add(R.id.movie_detail_container, fragment)
                    .commit()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem) =
            when (item.itemId) {
                android.R.id.home -> {
                    navigateUpTo(Intent(this, MovieListActivity::class.java))
                    true
                }
                else -> super.onOptionsItemSelected(item)
            }
}

```

其中的详情页的布局 XML 文件是activity_item_detail.xml， 代码如下
```xml
<android.support.design.widget.CoordinatorLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:fitsSystemWindows="true"
    tools:context="com.easy.kotlin.ItemDetailActivity"
    tools:ignore="MergeRootFrame">

    <android.support.design.widget.AppBarLayout
        android:id="@+id/app_bar"
        android:layout_width="match_parent"
        android:layout_height="@dimen/app_bar_height"
        android:fitsSystemWindows="true"
        android:theme="@style/ThemeOverlay.AppCompat.Dark.ActionBar">

        <android.support.design.widget.CollapsingToolbarLayout
            android:id="@+id/toolbar_layout"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:fitsSystemWindows="true"
            app:contentScrim="?attr/colorPrimary"
            app:layout_scrollFlags="scroll|exitUntilCollapsed"
            app:toolbarId="@+id/toolbar">

            <android.support.v7.widget.Toolbar
                android:id="@+id/detail_toolbar"
                android:layout_width="match_parent"
                android:layout_height="?attr/actionBarSize"
                app:layout_collapseMode="pin"
                app:popupTheme="@style/ThemeOverlay.AppCompat.Light" />

        </android.support.design.widget.CollapsingToolbarLayout>

    </android.support.design.widget.AppBarLayout>

    <android.support.v4.widget.NestedScrollView
        android:id="@+id/item_detail_container"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:layout_behavior="@string/appbar_scrolling_view_behavior" />

    <android.support.design.widget.FloatingActionButton
        android:id="@+id/fab"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_vertical|start"
        android:layout_margin="@dimen/fab_margin"
        app:layout_anchor="@+id/item_detail_container"
        app:layout_anchorGravity="top|end"
        app:srcCompat="@android:drawable/stat_notify_chat" />

</android.support.design.widget.CoordinatorLayout>

```

我们把电影详情的 Fragment  的展示放到 NestedScrollView 中
```xml
    <android.support.v4.widget.NestedScrollView
        android:id="@+id/movie_detail_container"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:fitsSystemWindows="true"
        app:layout_behavior="@string/appbar_scrolling_view_behavior" />
```


电影详情的 Fragment  代码是 MovieDetailFragment

```kotlin
package com.easy.kotlin

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.easy.kotlin.bean.MovieContent
import com.easy.kotlin.util.HttpUtil
import kotlinx.android.synthetic.main.activity_movie_detail.*
import kotlinx.android.synthetic.main.movie_detail.view.*

class MovieDetailFragment : Fragment() {
    private var mItem: MovieContent.Movie? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (arguments.containsKey(ARG_MOVIE_ID)) {

            mItem = MovieContent.MOVIE_MAP[arguments.getString(ARG_MOVIE_ID)]
            mItem?.let {
                activity.toolbar_layout?.title = it.title
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // 绑定 movieDetailView
        val movieDetailView = inflater.inflate(R.layout.movie_detail, container, false)
        mItem?.let {
            movieDetailView.movie_poster_image.setImageBitmap(HttpUtil.getBitmapFromURL(it.posterPath))
            movieDetailView.movie_overview.text = "影片简介： ${it.overview}"
            movieDetailView.movie_vote_count.text = "打分次数：${it.vote_count}"
            movieDetailView.movie_vote_average.text = "评分：${it.vote_average}"
            movieDetailView.movie_release_date.text = "发行日期：${it.release_date}"
        }

        return movieDetailView
    }

    companion object {
        const val ARG_MOVIE_ID = "movie_id"
    }
}
```

其中的 R.layout.movie_detail 布局文件 movie_detail.xml 如下

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:layout_gravity="center"
    android:layout_margin="0dp"
    android:clickable="true"
    android:foreground="?attr/selectableItemBackground"
    android:orientation="vertical">



    <TextView
        android:id="@+id/movie_release_date"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:padding="16dp"
        android:textIsSelectable="true"
        android:textSize="18sp"
        tools:context="com.easy.kotlin.MovieDetailFragment" />

    <ImageView
        android:id="@+id/movie_poster_image"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_centerVertical="true"
        android:fitsSystemWindows="true"
        android:scaleType="fitCenter" />



    <TextView
        android:id="@+id/movie_overview"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:padding="16dp"
        android:textIsSelectable="true"
        android:textSize="18sp"
        tools:context="com.easy.kotlin.MovieDetailFragment" />


    <TextView
        android:id="@+id/movie_vote_average"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:padding="16dp"
        android:textIsSelectable="true"
        android:textSize="18sp"
        tools:context="com.easy.kotlin.MovieDetailFragment" />

    <TextView
        android:id="@+id/movie_vote_count"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:padding="16dp"
        android:textIsSelectable="true"
        android:textSize="18sp"
        tools:context="com.easy.kotlin.MovieDetailFragment" />


</LinearLayout>

```

#### 电影源数据的获取 

我们定义了一个 MovieContent 对象类来存储从 API 获取到的数据，代码如下
```kotlin
package com.easy.kotlin.bean

import android.os.StrictMode
import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.JSONArray
import java.net.URL
import java.nio.charset.Charset
import java.util.*


object MovieContent {

    val MOVIES: MutableList<Movie> = ArrayList()
    val MOVIE_MAP: MutableMap<String, Movie> = HashMap()

    val VOTE_AVERAGE_API = "http://api.themoviedb.org//3/discover/movie?sort_by=popularity.desc&api_key=7e55a88ece9f03408b895a96c1487979&page=1"

    init {
        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)
        initMovieListData()
    }

    private fun initMovieListData() {

        val jsonstr = URL(VOTE_AVERAGE_API).readText(Charset.defaultCharset())
        try {
            val obj = JSON.parse(jsonstr) as Map<*, *>
            val dataArray = obj.get("results") as JSONArray

            dataArray.forEachIndexed { index, it ->
                val title = (it as Map<*, *>).get("title") as String
                val overview = it.get("overview") as String
                val poster_path = it.get("poster_path") as String
                val vote_count = it.get("vote_count").toString()
                val vote_average = it.get("vote_average").toString()
                val release_date = it.get("release_date").toString()
                addMovie(Movie(id = index.toString(),
                        title = title,
                        overview = overview,
                        vote_count = vote_count,
                        vote_average = vote_average,
                        release_date = release_date,
                        posterPath = getPosterUrl(poster_path)))
            }

        } catch (ex: Exception) {
            ex.printStackTrace()
        }

    }

    private fun addMovie(movie: Movie) {
        MOVIES.add(movie)
        MOVIE_MAP.put(movie.id, movie)
    }


    fun getPosterUrl(posterPath: String): String {
        return "https://image.tmdb.org/t/p/w185_and_h278_bestv2$posterPath"
    }

    data class Movie(val id: String,
                     val title: String,
                     val overview: String,
                     val vote_count: String,
                     val vote_average: String,
                     val release_date: String,
                     val posterPath: String)


}

```

在 Android 4.0 之后默认的线程模式是不允许在主线程中访问网络。为了演示效果，我们在访问网络的代码前，把 ThreadPolicy 设置为允许运行访问网络

```
val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
StrictMode.setThreadPolicy(policy)
```

我们使用了一个 data class Movie 来存储电影对象数据
```kotlin
    data class Movie(val id: String,
                     val title: String,
                     val overview: String,
                     val vote_count: String,
                     val vote_average: String,
                     val release_date: String,
                     val posterPath: String)
```





#### 配置 AndroidManifest.xml

最后，我们配置 AndroidManifest.xml文件内容如下

```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.easy.kotlin">

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">
        ...
        <activity
            android:name=".MovieListActivity"
            android:label="@string/app_name"
            android:theme="@style/AppTheme.NoActionBar">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
        <activity
            android:name=".MovieDetailActivity"
            android:label="@string/title_movie_detail"
            android:parentActivityName=".MovieListActivity"
            android:theme="@style/AppTheme.NoActionBar">
            <meta-data
                android:name="android.support.PARENT_ACTIVITY"
                android:value="com.easy.kotlin.MovieListActivity" />
        </activity>
    </application>

    <uses-permission android:name="android.permission.INTERNET" />

</manifest>

```

因为我们要访问网络，所以需要添加该行配置
```xml
<uses-permission android:name="android.permission.INTERNET" />
```

再次打包安装运行，效果图如下

电影列表页面


![电影列表页面](http://upload-images.jianshu.io/upload_images/1233356-79c3243fdc6346dc.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



点击进入电影详情页


![电影详情页](http://upload-images.jianshu.io/upload_images/1233356-ff6464207e6db595.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



## 本章小结

Android 中经常出现的空引用、API的冗余样板式代码等都是是驱动我们转向 Kotlin 语言的动力。另外，Kotlin 的 Android 视图 DSL  Anko 可以我们从繁杂的 XML 视图配置文件中解放出来。我们可以像在 Java 中一样方便的使用 Android 开发的流行的库诸如 Butter Knife、Realm、RecyclerView等。当然，我们使用 Kotlin 集成这些库来进行 Andorid 开发，既能够直接使用我们之前的开发库，又能够从 Java 语言、Android API 的限制中出来。这不得不说是一件好事。


本章工程源码：https://github.com/Android-Kotlin/MovieGuideDB
