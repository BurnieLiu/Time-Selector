# Time-Selector
[ ![Download](https://api.bintray.com/packages/liuli/maven/Time-Selector/images/download.svg) ](https://bintray.com/liuli/maven/Time-Selector/_latestVersion) 
####控件基于[jingchenUSTC/TimePicker](https://github.com/jingchenUSTC/TimePicker "感谢jingchenUSTC" )

---


![Loading](http://7xosuk.com1.z0.glb.clouddn.com/aaa.gif)




使用：
>Android Studio中直接在 gradle中加入：
```javascript
compile 'com.feezu.liuli:timeselector:1.1.3+' 
```
>Eclipse下请下载源码（建议尽早迁移至Studio）

构造1：
><pre><code>TimeSelector(Context context, ResultHandler resultHandler, String startDate, String endDate)</code></pre>
>参数说明：ResultHandler为选取时间后的回调 startDate，endDate为时间控件的可选起始时间和结束时间。
```java
        TimeSelector timeSelector = new TimeSelector(this, new TimeSelector.ResultHandler() {
            @Override
            public void handle(String time) {
                Toast.makeText(getApplicationContext(), time, Toast.LENGTH_LONG).show();
            }
        }, "2015-11-22 17:34", "2015-12-1 15:20");
```

构造2：
```java 
	TimeSelector(Context context, ResultHandler resultHandler, String startDate, String endDate, String workStartTime, String workEndTime)
```
>参数说明：传入workStartTime，workEndTime可选时间为起始时间和结束时间范围内的每日“时：分”的起始和结束时间，如限制可选时间为：朝9晚5。
```java 
		TimeSelector timeSelector = new TimeSelector(this, new TimeSelector.ResultHandler() {
            @Override
            public void handle(String time) {
                Toast.makeText(getApplicationContext(), time, Toast.LENGTH_LONG).show();
            }
        }, "2015-10-30 10:34", "2015-12-1 17:34","9:00","17:00");
```
使用：
```java <code>timeSelector.show();```


1.1.0更新加入：
>限制拨动 时和分
在show前调用：     
```java  timeSelector.disScrollUnit(TimeSelector.SCROLLTYPE.HOUR, TimeSelector.SCROLLTYPE.MINUTE); ```
>设置显示模式： 年月日时分（默认）|年月日
在show前调用：
```java 
timeSelector.setMode(TimeSelector.MODE.YMDHM);//显示 年月日时分（默认）；
timeSelector.setMode(TimeSelector.MODE.YMD);//只显示 年月日
```

1.1.1更新加入：
>更新基础控件PickView,设置是否循环显示内容
可调用PickView实例的<code>setIsLoop(boolean isLoop)</code>方法，也可以在布局中如下使用
```xml
		<org.feezu.liuli.timeselector.view.PickerView
                    android:id="@+id/month_pv"
                    android:layout_width="0dp"
                    android:layout_height="160dp"
                    android:layout_weight="2"
                    app:isLoop="false" /> 
```            
>TimeSelector时间控件整体设置是否循环显示内容
在show()前调用：
        
```java  timeSelector.setIsLoop(false);//不设置时为true，即循环显示 ```



