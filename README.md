# RecyclerViewHelper
RecyclerviewHelper is Android Library that help to setup recyclerview without creating adapter class

how to use

Include the library in your build.gradle

dependencies {
    implementation 'com.github.iandamping:RecyclerViewHelper:0.0.1'
}

and include this in top level build.gradle

allprojects {
    repositories {
       ...
       ...
        maven { url "https://jitpack.io"}
    }
}

To start using this library is you just need to call this Recyclerview Extension Function for your Recyclerwiew with 
setUpVertical(),setUpHorizontal() or setUpWithGrid() with a valid Activity:

rvActivityMain.setUpVertical(listData,R.layout.item_recyclerview,{
                tvItemMain.text = it
        },{
            Toast.makeText(this@MainActivity,"Click!", Toast.LENGTH_SHORT).show()
        })



