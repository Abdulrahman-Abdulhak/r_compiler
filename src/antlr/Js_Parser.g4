parser grammar Js_Parser;

options {
    tokenVocab = Js_Lexer;
}

program: line* EOF;

line
    : statement
    | function
    | ifBlock
    | whileBlock
    ;

statement: assignment | functionCall;

function: