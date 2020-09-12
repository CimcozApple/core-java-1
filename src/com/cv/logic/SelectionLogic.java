package com.cv.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author channaveer.p
 *
 */
public class SelectionLogic {

	public static void main(String[] args) {
 
		BufferedReader reader = null;
		String [] words = null;
		try{

			File file = new File("D:\\projects\\temp\\contract-arsequense.txt");
			reader = new BufferedReader(new FileReader(file));
			String currentline = reader.readLine();
			SequenseAndContract sequenseAndContract = null;
			List<SequenseAndContract> sequenseAndContracts = new ArrayList<SequenseAndContract>();
			Map<Integer, List<String>> sequenseAndContractMap = new HashMap<Integer, List<String>>();
			while(currentline != null){
				sequenseAndContract = new SequenseAndContract();
				// System.out.println(currentline);
				words = currentline.split(",", -1);
				for (int i = 0; i < words.length; i++) {
					if(i%2 == 0){
						// System.out.println(i);
						sequenseAndContract.setContractNo(Integer.parseInt(words[i]));
					}else{
						sequenseAndContract.setSequenseNo(words[i]);
						// System.out.println(i);
					}
				}
				sequenseAndContracts.add(sequenseAndContract);
				currentline = reader.readLine();
			}
			List<String> sequenseNo = null;
			System.out.println(sequenseAndContracts.size());
			for (SequenseAndContract data : sequenseAndContracts) {

				if (!sequenseAndContractMap.containsKey(data.getContractNo())) {
					sequenseNo = new ArrayList<String>();
					sequenseNo.add(data.getSequenseNo());
					sequenseAndContractMap
							.put(data.getContractNo(), sequenseNo);
				} else {
					sequenseNo = sequenseAndContractMap.get(data
							.getContractNo());
					sequenseNo.add(data.getSequenseNo());
					sequenseAndContractMap
							.put(data.getContractNo(), sequenseNo);
				}

				System.out.println("Sequense No:" + data.getSequenseNo());
				System.out.println("Contract NO:" + data.getContractNo());
			}
			System.out.println(sequenseAndContractMap);
			if (reader != null) {
				reader.close();
				System.out.println("In close method :");
			}

		} catch (Exception e){
			e.printStackTrace();
		}
		
	}

}
