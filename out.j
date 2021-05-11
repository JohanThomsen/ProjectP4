.class public Out
.super java/lang/Object
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method
.method public static main([Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
astore 5
new java/util/Scanner
dup
getstatic java/lang/System.in Ljava/io/InputStream;
invokespecial java/util/Scanner.<init>(Ljava/io/InputStream;)V
astore 6
ldc 4.0
ldc 4.0
fadd
ldc 5.0
fcmpl
ifgt truelabel0
iconst_0
goto endlabel0
truelabel0:
iconst_1
endlabel0:
i2f
fstore 7
aload 5
fload 7
invokevirtual java/io/PrintStream/println(F)V
.limit locals 8
.limit stack 10
return
.end method
