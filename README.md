# Spring Boot + Mybatis + Redis�������� 
  
  mybatis�������������ļ�
  
  Spring-Boot�����ṩ�˸��ֿ��伴�õĲ����ʹ������Ϊ�˵���
  ��Ϊ������Java Web�������֮һ��Mybatis��һ��ʮ����������
  ��ORM��ܡ�Redis�ǵ���ʮ�������ķֲ�ʽkey-value�����ݿ⣬
  ��web�����У����ǳ��������������ݿ�Ĳ�ѯ�����

  ʹ��Spring-Boot���ٴһ��WebӦ�ã����Ҳ���Mybatis��Ϊ��
  �ǵ�ORM��ܡ�Ϊ���������ܣ����ǽ�Redis��ΪMybatis�Ķ�����
  �档

  @RequestMapping��@GetMapping��@PutMapping����ʾ�ӿڵ�URL��
  ַ��
  ��ע�����ϵ�@RequestMappingע���ʾ�����µ����нӿڵ�URL��
  ��/product��ͷ��
  @GetMapping��ʾ����һ��Get HTTP�ӿڣ�
  @PutMapping��ʾ����һ��Put HTTP�ӿڡ�
  
  redisˮƽ��չ���ӽڵ�
  redis-trib.rb add-node
  redis-trib.rb reshard 