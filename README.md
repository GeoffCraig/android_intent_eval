# android_intent_eval
Super simple Android app


### Purpose
This is a simple Android app with two activities.  The first activity has an EditText a button and a TextView.  When you click the button you launch an intent that send you to another activity.  The only way back is the back button on the phone.

### What is this things purpose?
Well, I wanted to test the fact that if you launch a seperate activity via an intent that onSaveInstanceState is *not* called.  That's it.  You can test this by changing the orientation of the device and you will see that what you typed in the EditText shows up in the TextView.
