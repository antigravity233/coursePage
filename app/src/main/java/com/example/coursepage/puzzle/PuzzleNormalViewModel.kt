package com.example.coursepage.puzzle

import android.graphics.Color
import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.coursepage.R

class PuzzleNormalViewModel : ViewModel() {
    val cube_number: IntArray = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8)
    val cube_operator_string: IntArray = intArrayOf(
        R.drawable.plus_solid,
        R.drawable.minus_solid,
        R.drawable.xmark_solid
    )

    var cube_blank: IntArray = intArrayOf(
        Color.WHITE,
        Color.WHITE,
        Color.WHITE,
        Color.BLACK,
        Color.BLACK,
        Color.BLACK,
        Color.BLACK,
        Color.BLACK,
        Color.BLACK)

    val cube_operator: IntArray = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)

    var cube_score = 0

    val cube_result: IntArray = intArrayOf(0,1, 2, 3, 4, 5)

    init {
        cube_score = 0
        cube_blank.shuffle()
    }

    fun setCube() {
        for (i in 0..8) {
            cube_number[i] = (1..20).random()
        }

        for (i in 0..11) {
            cube_operator[i] = cube_operator_string.random()
        }
        setResult1()
        setResult2()
        setResult3()
        setResult4()
        setResult5()
        setResult6()
        cube_blank.shuffle()
        cube_score = 0

        setAllresult()

    }

    fun correct(){
        cube_score++
    }

    fun setAllresult() {

        setResult1()
        setResult2()
        setResult3()
        setResult4()
        setResult5()
        setResult6()
    }

    fun setResult1(){
        if(cube_operator[0] == R.drawable.plus_solid &&
            cube_operator[1] == R.drawable.plus_solid){
            cube_result[0] = cube_number[0] + cube_number[1] + cube_number[2]
        }
        else if (cube_operator[0] == R.drawable.minus_solid &&
            cube_operator[1] == R.drawable.plus_solid){
            cube_result[0] = cube_number[0] - cube_number[1] + cube_number[2]
        }
        else if (cube_operator[0] == R.drawable.xmark_solid &&
            cube_operator[1] == R.drawable.plus_solid){
            cube_result[0] = cube_number[0] * cube_number[1] + cube_number[2]
        }
        else if (cube_operator[0] == R.drawable.plus_solid &&
            cube_operator[1] == R.drawable.minus_solid){
            cube_result[0] = cube_number[0] + cube_number[1] - cube_number[2]
        }
        else if (cube_operator[0] == R.drawable.minus_solid &&
            cube_operator[1] == R.drawable.minus_solid) {
            cube_result[0] = cube_number[0] - cube_number[1] - cube_number[2]
        }
        else if (cube_operator[0] == R.drawable.xmark_solid &&
            cube_operator[1] == R.drawable.minus_solid) {
            cube_result[0] = cube_number[0] * cube_number[1] - cube_number[2]
        }
        else if (cube_operator[0] == R.drawable.plus_solid &&
            cube_operator[1] == R.drawable.xmark_solid){
            cube_result[0] = cube_number[0] + cube_number[1] * cube_number[2]
        }
        else if (cube_operator[0] == R.drawable.minus_solid &&
            cube_operator[1] == R.drawable.xmark_solid) {
            cube_result[0] = cube_number[0] - cube_number[1] * cube_number[2]
        }
        else {
            cube_result[0] = cube_number[0] * cube_number[1] * cube_number[2]
        }
    }

    fun setResult2(){
        if(cube_operator[5] == R.drawable.plus_solid &&
            cube_operator[6] == R.drawable.plus_solid){
            cube_result[1] = cube_number[3] + cube_number[4] + cube_number[5]
        }
        else if (cube_operator[5] == R.drawable.minus_solid &&
            cube_operator[6] == R.drawable.plus_solid){
            cube_result[1] = cube_number[3] - cube_number[4] + cube_number[5]
        }
        else if (cube_operator[5] == R.drawable.xmark_solid &&
            cube_operator[6] == R.drawable.plus_solid){
            cube_result[1] = cube_number[3] * cube_number[4] + cube_number[5]
        }
        else if (cube_operator[5] == R.drawable.plus_solid &&
            cube_operator[6] == R.drawable.minus_solid){
            cube_result[1] = cube_number[3] + cube_number[4] - cube_number[5]
        }
        else if (cube_operator[5] == R.drawable.minus_solid &&
            cube_operator[6] == R.drawable.minus_solid) {
            cube_result[1] = cube_number[3] - cube_number[4] - cube_number[5]
        }
        else if (cube_operator[5] == R.drawable.xmark_solid &&
            cube_operator[6] == R.drawable.minus_solid) {
            cube_result[1] = cube_number[3] * cube_number[4] - cube_number[5]
        }
        else if (cube_operator[5] == R.drawable.plus_solid &&
            cube_operator[6] == R.drawable.xmark_solid){
            cube_result[1] = cube_number[3] + cube_number[4] * cube_number[5]
        }
        else if (cube_operator[5] == R.drawable.minus_solid &&
            cube_operator[6] == R.drawable.xmark_solid) {
            cube_result[1] = cube_number[3] - cube_number[4] * cube_number[5]
        }
        else {
            cube_result[1] = cube_number[3] * cube_number[4] * cube_number[5]
        }
    }

    fun setResult3(){
        if(cube_operator[10] == R.drawable.plus_solid &&
            cube_operator[11] == R.drawable.plus_solid){
            cube_result[2] = cube_number[6] + cube_number[7] + cube_number[8]
        }
        else if (cube_operator[10] == R.drawable.minus_solid &&
            cube_operator[11] == R.drawable.plus_solid){
            cube_result[2] = cube_number[6] - cube_number[7] + cube_number[8]
        }
        else if (cube_operator[10] == R.drawable.xmark_solid &&
            cube_operator[11] == R.drawable.plus_solid){
            cube_result[2] = cube_number[6] * cube_number[7] + cube_number[8]
        }
        else if (cube_operator[10] == R.drawable.plus_solid &&
            cube_operator[11] == R.drawable.minus_solid){
            cube_result[2] = cube_number[6] + cube_number[7] - cube_number[8]
        }
        else if (cube_operator[10] == R.drawable.minus_solid &&
            cube_operator[11] == R.drawable.minus_solid) {
            cube_result[2] = cube_number[6] - cube_number[7] - cube_number[8]
        }
        else if (cube_operator[10] == R.drawable.xmark_solid &&
            cube_operator[11] == R.drawable.minus_solid) {
            cube_result[2] = cube_number[6] * cube_number[7] - cube_number[8]
        }
        else if (cube_operator[10] == R.drawable.plus_solid &&
            cube_operator[11] == R.drawable.xmark_solid){
            cube_result[2] = cube_number[6] + cube_number[7] * cube_number[8]
        }
        else if (cube_operator[10] == R.drawable.minus_solid &&
            cube_operator[11] == R.drawable.xmark_solid) {
            cube_result[2] = cube_number[6] - cube_number[7] * cube_number[8]
        }
        else {
            cube_result[2] = cube_number[6] * cube_number[7] * cube_number[8]
        }
    }

    fun setResult4(){
        if(cube_operator[2] == R.drawable.plus_solid &&
            cube_operator[7] == R.drawable.plus_solid){
            cube_result[3] = cube_number[0] + cube_number[3] + cube_number[6]
        }
        else if (cube_operator[2] == R.drawable.minus_solid &&
            cube_operator[7] == R.drawable.plus_solid){
            cube_result[3] = cube_number[0] - cube_number[3] + cube_number[6]
        }
        else if (cube_operator[2] == R.drawable.xmark_solid &&
            cube_operator[7] == R.drawable.plus_solid){
            cube_result[3] =cube_number[0] * cube_number[3] + cube_number[6]
        }
        else if (cube_operator[2] == R.drawable.plus_solid &&
            cube_operator[7] == R.drawable.minus_solid){
            cube_result[3] = cube_number[0] + cube_number[3] - cube_number[6]
        }
        else if (cube_operator[2] == R.drawable.minus_solid &&
            cube_operator[7] == R.drawable.minus_solid) {
            cube_result[3] = cube_number[0] - cube_number[3] - cube_number[6]
        }
        else if (cube_operator[2] == R.drawable.xmark_solid &&
            cube_operator[7] == R.drawable.minus_solid) {
            cube_result[3] = cube_number[0] * cube_number[3] - cube_number[6]
        }
        else if (cube_operator[2] == R.drawable.plus_solid &&
            cube_operator[7] == R.drawable.xmark_solid){
            cube_result[3] = cube_number[0] + cube_number[3] * cube_number[6]
        }
        else if (cube_operator[2] == R.drawable.minus_solid &&
            cube_operator[7] == R.drawable.xmark_solid) {
            cube_result[3] = cube_number[0] - cube_number[3] * cube_number[6]
        }
        else {
            cube_result[3] = cube_number[0] * cube_number[3] * cube_number[6]
        }
    }

    fun setResult5(){
        if(cube_operator[3] == R.drawable.plus_solid &&
            cube_operator[8] == R.drawable.plus_solid){
            cube_result[4] = cube_number[1] + cube_number[4] + cube_number[7]
        }
        else if (cube_operator[3] == R.drawable.minus_solid &&
            cube_operator[8] == R.drawable.plus_solid){
            cube_result[4] = cube_number[1] -cube_number[4] + cube_number[7]
        }
        else if (cube_operator[3] == R.drawable.xmark_solid &&
            cube_operator[8] == R.drawable.plus_solid){
            cube_result[4] =cube_number[1] * cube_number[4] + cube_number[7]
        }
        else if (cube_operator[3] == R.drawable.plus_solid &&
            cube_operator[8] == R.drawable.minus_solid){
            cube_result[4] = cube_number[1] + cube_number[4] - cube_number[7]
        }
        else if (cube_operator[3] == R.drawable.minus_solid &&
            cube_operator[8] == R.drawable.minus_solid) {
            cube_result[4] = cube_number[1] - cube_number[4] - cube_number[7]
        }
        else if (cube_operator[3] == R.drawable.xmark_solid &&
            cube_operator[8] == R.drawable.minus_solid) {
            cube_result[4] = cube_number[1] * cube_number[4] - cube_number[7]
        }
        else if (cube_operator[3] == R.drawable.plus_solid &&
            cube_operator[8] == R.drawable.xmark_solid){
            cube_result[4] = cube_number[1] + cube_number[4] * cube_number[7]
        }
        else if (cube_operator[3] == R.drawable.minus_solid &&
            cube_operator[8] == R.drawable.xmark_solid) {
            cube_result[4] = cube_number[1] - cube_number[4] * cube_number[7]
        }
        else {
            cube_result[4] = cube_number[1] * cube_number[4] * cube_number[7]
        }

    }

    fun setResult6() {
        if(cube_operator[4] == R.drawable.plus_solid &&
            cube_operator[9] == R.drawable.plus_solid){
            cube_result[5] = cube_number[2] + cube_number[5] + cube_number[8]
        }
        else if (cube_operator[4] == R.drawable.minus_solid &&
            cube_operator[9] == R.drawable.plus_solid){
            cube_result[5] = cube_number[2] - cube_number[5] + cube_number[8]
        }
        else if (cube_operator[4] == R.drawable.xmark_solid &&
            cube_operator[9] == R.drawable.plus_solid){
            cube_result[5] = cube_number[2] * cube_number[5] + cube_number[8]
        }
        else if (cube_operator[4] == R.drawable.plus_solid &&
            cube_operator[9] == R.drawable.minus_solid){
            cube_result[5] = cube_number[2] + cube_number[5] - cube_number[8]
        }
        else if (cube_operator[4] == R.drawable.minus_solid &&
            cube_operator[9] == R.drawable.minus_solid) {
            cube_result[5] = cube_number[2] - cube_number[5] - cube_number[8]
        }
        else if (cube_operator[4] == R.drawable.xmark_solid &&
            cube_operator[9] == R.drawable.minus_solid) {
            cube_result[5] = cube_number[2] * cube_number[5] - cube_number[8]
        }
        else if (cube_operator[4] == R.drawable.plus_solid &&
            cube_operator[9] == R.drawable.xmark_solid){
            cube_result[5] = cube_number[2] + cube_number[5] * cube_number[8]
        }
        else if (cube_operator[4] == R.drawable.minus_solid &&
            cube_operator[9] == R.drawable.xmark_solid) {
            cube_result[5] = cube_number[2] - cube_number[5] * cube_number[8]
        }
        else {
            cube_result[5] = cube_number[2] * cube_number[5] * cube_number[8]
        }

    }
}