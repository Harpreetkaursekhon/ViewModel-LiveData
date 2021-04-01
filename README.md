# ViewModel-LiveData
ViewModel is a part of Android Architecture Components(AAC). ViewModel is designed for the management and storage of UI related data in a lifecycle in a conscious way. 
ViewModel class survive the configuration changes on screen rotation. 

Advantages of ViewModel:

Survive configuration changes
Avoid memory leaks - as it don't keep an instance of activity/fragment
Lifecycle awareness- ViewModel objects are aware of lifecycle so it get cleared when observing lifecycle is destroyed. 

LiveData is observable data holder class and it is part of Android jetpack. 
LiveData is lifecycle aware and it ensures LiveData only updates app components that are in activity lifecycle state.
In simple words, LiveData is used for observing the changes in the view and update the view when it is active. 
