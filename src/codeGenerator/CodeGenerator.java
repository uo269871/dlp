package codeGenerator;

import ast.Type;

import java.io.PrintWriter;

public class CodeGenerator {

    private PrintWriter out;
    private int counter = 0;

    public CodeGenerator(String outputFilename, String inputFilename) {
        try {
            out = new PrintWriter(outputFilename);
        } catch (Exception e) {
            System.err.println("Error al abrir el fichero " + outputFilename);
            System.exit(-1);
        }
        this.source(inputFilename);
    }

    public void mainInvocation() {
        out.println("\n' Invocation to the main function");
        out.println("call main");
        out.flush();
        this.halt();
    }


    public int getLabel(){
        return counter++;
    }

    // Push instructions
    public void push(int i) {
        out.println("\tpushi\t" + i);
        out.flush();
    }

    public void push(char c) {
        out.println("\tpushb\t" + (int) c);
        out.flush();
    }

    public void push(double f) {
        out.println("\tpushf\t" + f);
        out.flush();
    }

    public void pushBP() {
        out.println("\tpusha\tbp");
        out.flush();
    }

    public void pushA(int dir) {
        out.println("\tpusha\t" + dir);
        out.flush();
    }

    // Load and store
    public void store(Type t) {
        out.println("\tstore" + t.suffix());
        out.flush();
    }

    public void load(Type t) {
        out.println("\tload" + t.suffix());
        out.flush();
    }

    // Stack operations
    public void pop(Type t) {
        out.println("\tpop" + t.suffix());
        out.flush();
    }

    public void dup(Type t) {
        out.println("\tdup" + t.suffix());
        out.flush();
    }

    // Arithmetic operations
    public void add(Type t) {
        out.println("\tadd" + t.suffix());
        out.flush();
    }

    public void sub(Type t) {
        out.println("\tsub" + t.suffix());
        out.flush();
    }

    public void mul(Type t) {
        out.println("\tmul" + t.suffix());
        out.flush();
    }

    public void div(Type t) {
        out.println("\tdiv" + t.suffix());
        out.flush();
    }

    public void mod(Type t) {
        out.println("\tmod" + t.suffix());
        out.flush();
    }

    // Comparison operations
    public void gt(Type t) {
        out.println("\tgt" + t.suffix());
        out.flush();
    }

    public void ge(Type t) {
        out.println("\tge" + t.suffix());
        out.flush();
    }

    public void lt(Type t) {
        out.println("\tlt" + t.suffix());
        out.flush();
    }

    public void le(Type t) {
        out.println("\tle" + t.suffix());
        out.flush();
    }

    public void eq(Type t) {
        out.println("\teq" + t.suffix());
        out.flush();
    }

    public void ne(Type t) {
        out.println("\tne" + t.suffix());
        out.flush();
    }

    // Logical operations
    public void and() {
        out.println("\tand");
        out.flush();
    }

    public void or() {
        out.println("\tor");
        out.flush();
    }

    public void not() {
        out.println("\tnot");
        out.flush();
    }

    // Input/Output
    public void out(Type t) {
        out.println("\tout" + t.suffix());
        out.flush();
    }

    public void in(Type t) {
        out.println("\tin" + t.suffix());
        out.flush();
    }

    // Conversions
    public void b2i() {
        out.println("\tb2i");
        out.flush();
    }

    public void i2f() {
        out.println("\ti2f");
        out.flush();
    }

    public void f2i() {
        out.println("\tf2i");
        out.flush();
    }

    public void i2b() {
        out.println("\ti2b");
        out.flush();
    }

    // Jumps
    public void id(String id) {
        out.println(" "+ id + ":");
        out.flush();
    }

    public void jmp(String id) {
        out.println("\tjmp\t" + id);
        out.flush();
    }

    public void jz(String id) {
        out.println("\tjz\t" + id);
        out.flush();
    }

    public void jnz(String id) {
        out.println("\tjnz\t" + id);
        out.flush();
    }

    // Functions
    public void call(String id) {
        out.println("\tcall\t" + id);
        out.flush();
    }

    public void enter(int bytes) {
        out.println("\tenter\t" + bytes);
        out.flush();
    }

    public void ret(int ret, int local, int params) {
        out.println("\tret\t" + ret + ", " + local + ", " + params);
        out.flush();
    }

    public void halt() {
        out.println("halt");
        out.println();
        out.flush();
    }

    // Debugging info
    public void source(String inputFilename) {
        out.println("\n#source\t\"" + inputFilename + "\"");
        out.println();
        out.flush();
    }

    public void line(int line){
        out.println();
        out.println("#line\t" + line);
        out.flush();
    }

    public void comment(String comment){
        out.println("\t' * " + comment);
    }

    public void writeLine() { out.println(); out.flush(); }
}
