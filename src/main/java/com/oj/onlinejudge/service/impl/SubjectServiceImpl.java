package com.oj.onlinejudge.service.impl;

import com.oj.onlinejudge.dao.SubjectDao;
import com.oj.onlinejudge.dao.TestCaseDao;
import com.oj.onlinejudge.dao.UserDao;
import com.oj.onlinejudge.entity.Subject;
import com.oj.onlinejudge.entity.TestCase;
import com.oj.onlinejudge.entity.User;
import com.oj.onlinejudge.model.SubjectModel;
import com.oj.onlinejudge.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.List;

/**
 * @author CHNxindong
 * @date 2020/3/11 21:11
 */
@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    SubjectDao subjectDao;

    @Autowired
    TestCaseDao testCaseDao;

    @Override
    public List<Subject> getSubjectList() {
        List<Subject> subjectList = subjectDao.getSubjectList();

        return subjectList;
    }

    @Override
    public Subject getSubjectBySid(Integer sid) {
        Subject subject = subjectDao.getSubjectBySid(sid);

        return subject;
    }

    @Override
    public List<Subject> getSubjectListByUid(Integer uid) {
        List<Subject> subjectList = subjectDao.getSubjectListByUid(uid);

        return subjectList;
    }

    @Override
    public String submit(Integer sid, Integer uid, String answer) {
        String filePath = operationStringToFile(answer);
        Boolean op2 = operationExec(filePath);

        return "ok";
    }

    @Override
    public String insertSubject(SubjectModel subjectModel) {
        subjectDao.save(subjectModel.getSubject());
        List<TestCase> testcaseList = subjectModel.getTestcaseList();
        testCaseDao.save(testcaseList);

        return "ok";
    }

    @Override
    public String deleteSubjectBySid(Long sid) {
        subjectDao.delete(sid);

        return "ok";
    }

    /**
     * 将字符串输出为java文件
     * @param answer
     * @return
     */
    public String operationStringToFile(String answer){
        File file = new File("C:/code/A.java");

        try (FileOutputStream fop = new FileOutputStream(file)) {

            if (!file.exists()) {
                file.createNewFile();
            }

            byte[] contentInBytes = answer.getBytes();

            fop.write(contentInBytes);
            fop.flush();
            fop.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return file.getAbsolutePath();
    }

    /**
     * 执行java文件
     * @param filePath
     * @return
     */
    public Boolean operationExec(String filePath){
        BufferedReader br = null;
        try {
//			CompilerJavaFile("c:\\code\\A.java", "c:\\code");
//			简易版
            String[] cmd = { "cmd", "/c", "javac C:\\code\\A.java & java -classpath C:\\code A" };
//			String cmd = "java -classpath c:\\code A";
            Process p = Runtime.getRuntime().exec(cmd);
            System.out.println("aa");
            br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                if(line.equals("ok le")){
                    System.out.println("goal");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        return true;
    }
}
