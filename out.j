.class public examples/out
.super java/lang/Object
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method
.method public static main([Ljava/lang/String;)V
.limit locals 10
.limit stack 10
ldc 5.0
fstore 0
ldc 12.0
fstore 1
fload 1
fstore 2
ldc "Hello"
astore 3
fload 0
fload 1
fmul
fstore 4
LoopStart:
i2f
i2f
fcmpl
iflt truelabel
iconst_0
goto endlabel
truelabel:
iconst_1
endlabel:
ifeq BranchEnd
fload 0
ldc 1.0
fadd
fstore 0
ldc 8.0
fstore 5
i2f
i2f
fcmpl
ifgt truelabel
iconst_0
goto endlabel
truelabel:
iconst_1
endlabel:
ifeq BranchEnd
ldc 5.0
ldc 4.0
fadd
fstore 6
ldc 5.0
ldc 4.0
fadd
fstore 7
BranchEnd:
goto Loopstart
BranchEnd:
getstatic java/lang/System/out Ljava/io/PrintStream;
astore_1
invokestatic java/lang/String/valueOf(F)Ljava/lang/String;
astore_3
aload_1
aload_3
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method
