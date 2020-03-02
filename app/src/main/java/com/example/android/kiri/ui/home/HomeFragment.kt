package com.example.android.kiri.ui.home

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.android.kiri.R
import com.example.android.kiri.databinding.IncludeHomeItemBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
//        val textView: TextView = root.findViewById(R.id.text_home)
//        homeViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        return root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewGroup = view.findViewById<LinearLayout>(R.id.content_layout)
        // １行追加ボタン
        view.findViewById<View>(R.id.add_button).also { v ->
            v.setOnClickListener {
                addItem(viewGroup)
            }
        }
        // クリアボタン
        view.findViewById<View>(R.id.clear_button).also { v ->
            v.setOnClickListener {
                viewGroup.removeAllViews()
                addItem(viewGroup)
            }
        }
    }

    private fun addItem(viewGroup: LinearLayout) {
        val layout = DataBindingUtil.inflate<IncludeHomeItemBinding>(
            LayoutInflater.from(this.requireContext()),
            R.layout.include_home_item,
            null,
            false
        )
        viewGroup.addView(
            layout.root,
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
    }
}
