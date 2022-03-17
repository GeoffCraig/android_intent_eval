# android_intent_eval
Super simple Android app


### Purpose
This is a simple Android app with two activities.  The first activity has an EditText, a Button and a TextView.  When you click the button you launch an intent that sends you to another activity.  The only way back is the back button on the phone.

### What is this things purpose?
Well, I wanted to test the fact that if you launch a seperate activity via an intent and then click the back button on the phone that onSaveInstanceState is *not* called.  That's it.  You can test this by changing the orientation of the device and you will see that what you typed in the EditText shows up in the TextView.  There is also a Log.i so you can see in logcat that isn't being called when you click the back button.

So basically I'm just proving I need to learn more about the Android lifecycle.
