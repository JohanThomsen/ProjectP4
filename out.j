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
LoopStart0:
ifeq BranchEnd0
fconst_1
fload_0
fadd
fstore_0
aload 5
ldc "You awake in a forest"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 5
ldc "There are paths NORTH and SOUTH"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 5
ldc "Choose a path"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 6
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String;
astore 7
aload 7
ldc "NORTH"
invokevirtual java/lang/String.compareTo(Ljava/lang/String;)I
i2f
fconst_0
fcmpl
ifeq truelabel0
iconst_0
goto endlabel0
truelabel0:
iconst_1
endlabel0:
i2f
ifeq BranchEnd1
aload 5
ldc "Tell me how long you spend walking north"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 6
invokevirtual java/util/Scanner.nextLine()F
astore 8
aload 7
fload 8
invokestatic Out/TheBeginning(Ljava/lang/String;F)V
BranchEnd1:
aload 7
ldc "SOUTH"
invokevirtual java/lang/String.compareTo(Ljava/lang/String;)I
i2f
fconst_0
fcmpl
ifeq truelabel1
iconst_0
goto endlabel1
truelabel1:
iconst_1
endlabel1:
i2f
ifeq BranchEnd2
aload 5
ldc "Tell me how long you spend walking South"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 6
invokevirtual java/util/Scanner.nextLine()F
astore 8
aload 7
fload 8
invokestatic Out/TheBeginning(Ljava/lang/String;F)V
BranchEnd2:
aload 7
ldc "PRESS ON"
invokevirtual java/lang/String.compareTo(Ljava/lang/String;)I
i2f
fconst_0
fcmpl
ifeq truelabel2
iconst_0
goto endlabel2
truelabel2:
iconst_1
endlabel2:
i2f
ifeq BranchEnd3
goto BranchEnd0
BranchEnd3:
goto LoopStart0
BranchEnd0:
.limit locals 9
.limit stack 10
return
.end method


.method public static TheBeginning(Ljava/lang/String;F)V
getstatic java/lang/System/out Ljava/io/PrintStream;
astore 3
new java/util/Scanner
dup
getstatic java/lang/System.in Ljava/io/InputStream;
invokespecial java/util/Scanner.<init>(Ljava/io/InputStream;)V
astore 4
aload 0
ldc "NORTH"
invokevirtual java/lang/String.compareTo(Ljava/lang/String;)I
i2f
fconst_0
fcmpl
ifeq truelabel3
iconst_0
goto endlabel3
truelabel3:
iconst_1
endlabel3:
i2f
ifeq BranchEnd4
fload 1
ldc 10.0
fcmpl
ifgt truelabel4
iconst_0
goto endlabel4
truelabel4:
iconst_1
endlabel4:
i2f
ifeq BranchEnd5
aload 3
ldc "You walk off the edge of the world"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
BranchEnd5:
fload 1
ldc 10.0
fcmpl
iflt truelabel5
iconst_0
goto endlabel5
truelabel5:
iconst_1
endlabel5:
i2f
ifeq BranchEnd6
aload 3
ldc "You arrive safely at home"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
BranchEnd6:
BranchEnd4:
aload 0
ldc "SOUTH"
invokevirtual java/lang/String.compareTo(Ljava/lang/String;)I
i2f
fconst_0
fcmpl
ifeq truelabel6
iconst_0
goto endlabel6
truelabel6:
iconst_1
endlabel6:
i2f
ifeq BranchEnd7
fload 1
ldc 10.0
fcmpl
ifgt truelabel7
iconst_0
goto endlabel7
truelabel7:
iconst_1
endlabel7:
i2f
ifeq BranchEnd8
aload 3
ldc "You walk off the edge of the world"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
BranchEnd8:
fload 1
ldc 10.0
fcmpl
iflt truelabel8
iconst_0
goto endlabel8
truelabel8:
iconst_1
endlabel8:
i2f
ifeq BranchEnd9
aload 3
ldc "You have ventured further into the forest"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 3
ldc "You can RETURN or PRESS ON"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 4
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String;
astore 7
aload 7
ldc "PRESS ON"
invokevirtual java/lang/String.compareTo(Ljava/lang/String;)I
i2f
fconst_0
fcmpl
ifeq truelabel9
iconst_0
goto endlabel9
truelabel9:
iconst_1
endlabel9:
i2f
ifeq BranchEnd10
aload 3
ldc "You emerge from the forest"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 3
ldc "You are far from home now"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 3
ldc "As you turn to look behind the forest path seems to have disappeared"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 3
ldc "Seems your only option is to move forwards"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 3
ldc "Good Luck"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
BranchEnd10:
BranchEnd9:
BranchEnd7:
.limit locals 5
.limit stack 10
return
.end method
