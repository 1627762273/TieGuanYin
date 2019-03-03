package com.bennyhuo.tieguanyin.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bennyhuo.tieguanyin.annotations.Builder
import com.bennyhuo.tieguanyin.sample.data.Person
import com.bennyhuo.tieguanyin.sample.fragments.replaceArbitraryDataTypeFragment

/**
 * Created by benny on 1/29/18.
 */
@Builder
class FragmentContainerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        title = this.javaClass.simpleName

        if(supportFragmentManager.findFragmentById(R.id.fragmentContainer) == null)
            replaceArbitraryDataTypeFragment(R.id.fragmentContainer, "Arbitrary DataType Fragment", Person(121212, "bennyhuo"))
    }
}
